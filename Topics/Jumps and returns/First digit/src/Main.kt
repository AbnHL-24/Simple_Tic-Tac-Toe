fun main() {
    // put your code here
    val string = readln()
    for (it in string) {
        when {
            it.isDigit() -> {
                println(it)
                break
            }
            else -> continue
        }
    }
}