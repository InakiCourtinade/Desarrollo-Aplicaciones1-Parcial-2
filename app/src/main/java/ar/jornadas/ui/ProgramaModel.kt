package ar.jornadas.ui

import android.app.Application
import androidx.lifecycle.*
import ar.jornadas.Servicios
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import java.io.IOException

class ProgramaModel(app: Application, private val estado: SavedStateHandle) : AndroidViewModel(app) {
    private val servicios = Servicios(app)
    val mesa = servicios.mesa
    private val repo = servicios.agenda
    val charlas = repo.programa.stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())
    val hayEdicion = repo.hayEdicion.stateIn(viewModelScope, SharingStarted.Eagerly, null)
    // Pedido 43: los filtros sobreviven a rotación y muerte del proceso
    val dia = estado.getStateFlow("dia", 0)
    val tema = estado.getStateFlow("tema", "Todos")
    fun elegirDia(d: Int) { estado["dia"] = d }
    fun elegirTema(t: String) { estado["tema"] = t }
    val aviso = MutableStateFlow("")
    val cargando = MutableStateFlow(false)

    // Pedido 44: sin peticiones superpuestas
    private var peticion: Job? = null

    fun cargaInicial() {
        if (cargaInicialHecha) return
        cargaInicialHecha = true
        recargar()
    }

    fun recargar() {
        if (peticion?.isActive == true) return
        peticion = viewModelScope.launch {
            cargando.value = true
            aviso.value = ""
            try {
                repo.sincronizar()
            } catch (e: IOException) {
                aviso.value = "No se pudo consultar el programa"
            } finally {
                cargando.value = false
            }
        }
    }

    fun marcar(id: String) { viewModelScope.launch { repo.cambiarFavorita(id) } }

    companion object {
        // Pedido 44: vive lo que vive el proceso -> una sola carga automática por proceso
        private var cargaInicialHecha = false
    }
}
