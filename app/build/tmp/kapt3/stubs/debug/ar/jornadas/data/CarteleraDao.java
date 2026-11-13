package ar.jornadas.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0097@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0015H\'J\u0010\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0015H\'\u00a8\u0006\u0017"}, d2 = {"Lar/jornadas/data/CarteleraDao;", "", "alternar", "", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aplicarInstantanea", "fichas", "", "Lar/jornadas/data/Charla;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "borrarTodas", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "guardar", "guardarEdicion", "edicion", "Lar/jornadas/data/Edicion;", "(Lar/jornadas/data/Edicion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idsFavoritas", "observar", "Lkotlinx/coroutines/flow/Flow;", "observarEdicion", "app_debug"})
@androidx.room.Dao()
public abstract interface CarteleraDao {
    
    @androidx.room.Query(value = "SELECT * FROM charlas ORDER BY dia, hora, sala")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<ar.jornadas.data.Charla>> observar();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object guardar(@org.jetbrains.annotations.NotNull()
    java.util.List<ar.jornadas.data.Charla> fichas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE charlas SET favorita = NOT favorita WHERE id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object alternar(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM edicion WHERE clave = 0")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<ar.jornadas.data.Edicion> observarEdicion();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object guardarEdicion(@org.jetbrains.annotations.NotNull()
    ar.jornadas.data.Edicion edicion, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT id FROM charlas WHERE favorita = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object idsFavoritas(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion);
    
    @androidx.room.Query(value = "DELETE FROM charlas")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object borrarTodas(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object aplicarInstantanea(@org.jetbrains.annotations.NotNull()
    java.util.List<ar.jornadas.data.Charla> fichas, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object aplicarInstantanea(@org.jetbrains.annotations.NotNull()
        ar.jornadas.data.CarteleraDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<ar.jornadas.data.Charla> fichas, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
    }
}