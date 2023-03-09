fun main() {
    val cantidadDeNumeros = readln().toInt()
    val listaDeNumeros = mutableListOf<Int>()
    var yesOrNo = "NO"
    for (indice in 0 until cantidadDeNumeros) listaDeNumeros.add(readln().toInt())
    val numero = readln().toInt()
    for (indice in listaDeNumeros) if (indice == numero) yesOrNo = "YES"
    println(yesOrNo)
}