class Calculadora(
    val marca: String,
    val aniosVida: Int,
    var precio: Double
) {
    fun sumar(a: Double, b: Double) = a + b
    fun restar(a: Double, b: Double) = a - b
    fun multiplicar(a: Double, b: Double) = a * b

    fun dividir(a: Double, b: Double): Double {
        require(b != 0.0) { "No dividir entre 0" }
        return a / b
    }
}