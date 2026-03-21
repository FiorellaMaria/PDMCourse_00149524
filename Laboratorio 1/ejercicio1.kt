data class Programa(val nombre: String)

class Computadora(
    var ram: Int,
    var almacenamiento: Int,
    var sistemaOperativo: String,
    val programasInstalados: MutableList<Programa>
) {
    fun encender() = println("Encendida")
    fun apagar() = println("Apagada")

    fun programasDelAnioActual(anio: Int): List<Programa> {
        return programasInstalados.filter { it.nombre.contains(anio.toString()) }
    }
}