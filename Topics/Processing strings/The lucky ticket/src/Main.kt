fun main() {
    val cadena = readln()
    val primerSuma = cadena[0].digitToInt() + cadena[1].digitToInt() + cadena[2].digitToInt()
    val segundaSuma = cadena[3].digitToInt() + cadena[4].digitToInt() + cadena[5].digitToInt()

    if (primerSuma == segundaSuma) {
        println("Lucky")
    } else println("Regular")
}