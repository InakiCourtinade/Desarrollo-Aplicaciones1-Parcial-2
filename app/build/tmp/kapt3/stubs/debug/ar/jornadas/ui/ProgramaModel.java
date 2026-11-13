package ar.jornadas.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u0001/B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020\tJ\u000e\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020\tJ\u0006\u0010.\u001a\u00020\'R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014\u00a8\u00060"}, d2 = {"Lar/jornadas/ui/ProgramaModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "estado", "Landroidx/lifecycle/SavedStateHandle;", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;)V", "aviso", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getAviso", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "cargando", "", "getCargando", "charlas", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lar/jornadas/data/Charla;", "getCharlas", "()Lkotlinx/coroutines/flow/StateFlow;", "dia", "", "getDia", "hayEdicion", "getHayEdicion", "mesa", "Lar/jornadas/lab/ServicioLocal;", "getMesa", "()Lar/jornadas/lab/ServicioLocal;", "peticion", "Lkotlinx/coroutines/Job;", "repo", "Lar/jornadas/data/AgendaRepository;", "servicios", "Lar/jornadas/Servicios;", "tema", "getTema", "cargaInicial", "", "elegirDia", "d", "elegirTema", "t", "marcar", "id", "recargar", "Companion", "app_debug"})
public final class ProgramaModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.SavedStateHandle estado = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.Servicios servicios = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.lab.ServicioLocal mesa = null;
    @org.jetbrains.annotations.NotNull()
    private final ar.jornadas.data.AgendaRepository repo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<ar.jornadas.data.Charla>> charlas = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> hayEdicion = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> dia = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> tema = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> aviso = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> cargando = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job peticion;
    private static boolean cargaInicialHecha = false;
    @org.jetbrains.annotations.NotNull()
    public static final ar.jornadas.ui.ProgramaModel.Companion Companion = null;
    
    public ProgramaModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle estado) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ar.jornadas.lab.ServicioLocal getMesa() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<ar.jornadas.data.Charla>> getCharlas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getHayEdicion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getDia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getTema() {
        return null;
    }
    
    public final void elegirDia(int d) {
    }
    
    public final void elegirTema(@org.jetbrains.annotations.NotNull()
    java.lang.String t) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getAviso() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getCargando() {
        return null;
    }
    
    public final void cargaInicial() {
    }
    
    public final void recargar() {
    }
    
    public final void marcar(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lar/jornadas/ui/ProgramaModel$Companion;", "", "()V", "cargaInicialHecha", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}