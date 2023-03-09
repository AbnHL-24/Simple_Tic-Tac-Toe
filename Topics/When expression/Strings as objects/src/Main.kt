fun main() {
    val input = readln()
    if (!input.isEmpty()) {
        when (input[0]) {
            'i' -> println(input.drop(1).toInt() + 1)
            's' -> println(input.drop(1).reversed())
            else -> print(input)
        }
    } else {
        print(input)
    }
}