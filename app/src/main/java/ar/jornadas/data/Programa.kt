package ar.jornadas.data

import androidx.room.*
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import retrofit2.http.GET
import kotlinx.coroutines.flow.Flow

data class FichaRemota(val id: String, val title: String, val track: String, val day: Int,
    val time: String, val room: String, val speaker: String, val summary: String)

interface ProgramaApi {
    @GET("programa") suspend fun consultar(): List<FichaRemota>
}

@Entity(tableName = "charlas")
data class Charla(@PrimaryKey val id: String, val titulo: String, val tema: String, val dia: Int,
    val hora: String, val sala: String, val ponente: String, val resumen: String,
    val favorita: Boolean = false)

// Pedido 41: marca que hay una edición válida guardada (aunque haya venido vacía)
@Entity(tableName = "edicion")
data class Edicion(@PrimaryKey val clave: Int = 0, val descargada: Long)

@Dao
interface CarteleraDao {
    @Query("SELECT * FROM charlas ORDER BY dia, hora, sala")
    fun observar(): Flow<List<Charla>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun guardar(fichas: List<Charla>)

    @Query("UPDATE charlas SET favorita = NOT favorita WHERE id = :id")
    suspend fun alternar(id: String)

    @Query("SELECT * FROM edicion WHERE clave = 0")
    fun observarEdicion(): Flow<Edicion?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun guardarEdicion(edicion: Edicion)

    @Query("SELECT id FROM charlas WHERE favorita = 1")
    suspend fun idsFavoritas(): List<String>

    @Query("DELETE FROM charlas")
    suspend fun borrarTodas()

    // Pedidos 41 y 42: la respuesta es una instantánea completa y se aplica en una transacción.
    // Las marcas se leen al llegar la respuesta (respeta lo marcado durante la petición) y se
    // conservan por id; lo que no vino se borra, así una charla que regresa vuelve sin marcar.
    @Transaction
    suspend fun aplicarInstantanea(fichas: List<Charla>) {
        val marcadas = idsFavoritas().toSet()
        borrarTodas()
        guardar(fichas.map { it.copy(favorita = it.id in marcadas) })
        guardarEdicion(Edicion(descargada = System.currentTimeMillis()))
    }
}

@Database(entities = [Charla::class, Edicion::class], version = 2, exportSchema = false)
abstract class Archivo : RoomDatabase() {
    abstract fun cartelera(): CarteleraDao
}

// La versión instalada ya tiene datos: se migra en lugar de recrear la base.
val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `edicion` (`clave` INTEGER NOT NULL, `descargada` INTEGER NOT NULL, PRIMARY KEY(`clave`))")
        db.execSQL("INSERT INTO edicion (clave, descargada) SELECT 0, 0 WHERE EXISTS (SELECT 1 FROM charlas)")
    }
}
