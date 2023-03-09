fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // do not touch the lines above
    var total = 0
    for (i in numbers) total += i
    numbers.add(0, total)
    numbers.removeAt(numbers.size - 2)

    // do not touch the lines below
    println(numbers.joinToString(" "))
}