package ar.jornadas.data

import kotlinx.coroutines.flow.map

class AgendaRepository(private val api: ProgramaApi, private val dao: CarteleraDao) {
    val programa = dao.observar()
    val hayEdicion = dao.observarEdicion().map { it != null }

    suspend fun sincronizar() {
        val fichas = api.consultar().map {
            Charla(it.id, it.title, it.track, it.day, it.time, it.room, it.speaker, it.summary)
        }
        dao.aplicarInstantanea(fichas)
    }

    suspend fun cambiarFavorita(id: String) = dao.alternar(id)
}
