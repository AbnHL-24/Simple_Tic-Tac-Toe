fun main() {
    val primeraLinea = readln()
    val segundaLinea = readln()

    if (primeraLinea.lowercase() == segundaLinea.lowercase()) {
        println(true)
    } else println(false)
}