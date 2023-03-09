fun main() {
    val string = readln()
    var cantidadDeLetrasRepetidas = 0

    for (i in string) {
        var letraRepetida = 0
        for (j in string) {
            if (i == j) {
                letraRepetida++
            }
            if (letraRepetida == 2) {
                break
            }
        }
        if (letraRepetida == 1) {
            cantidadDeLetrasRepetidas++
        }
    }
    println(cantidadDeLetrasRepetidas)
}