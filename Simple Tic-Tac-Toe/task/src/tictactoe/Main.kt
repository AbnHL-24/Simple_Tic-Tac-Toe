package tictactoe

fun main() {

    val str = "_________"
    var turno = 1
    val tablero = mutableListOf(
        mutableListOf(str[0], str[1], str[2]),
        mutableListOf(str[3], str[4], str[5]),
        mutableListOf(str[6], str[7], str[8])
    )
    imprimirCuadricula(tablero)

    do {
        val xy = readln()
        val x = xy[0]
        val y = xy[2]

        if (x.isDigit() && y.isDigit()){
            if (x.toString().toInt() in 1..3 && y.toString().toInt() in 1..3) {
                    if (tablero[x.toString().toInt()-1][y.toString().toInt()-1] != '_') {
                        println("This cell is occupied! Choose another one!")
                    } else {
                        tablero[x.toString().toInt()-1][y.toString().toInt()-1] =
                            if (turno == 1) 'X'
                            else 'O'
                        turno *= -1
                        imprimirCuadricula(tablero)
                    }
            } else {
                print("Coordinates should be from 1 to 3!")
            }
        } else {
            print("You should enter numbers!")
        }

    } while ((!tresEnLinea(tablero, 'X') && !tresEnLinea(tablero, 'O')) && tablero.toString().contains('_'))

    println(resultado(tablero))
}

private fun tresEnLinea (tablero: MutableList<MutableList<Char>>, char: Char): Boolean {
    //horizontales
    if (tablero[0][0] == char && (tablero[0][1] == char && tablero[0][2] == char)) {
        return true
    } else if (tablero[1][0] == char && (tablero[1][1] == char && tablero[1][2] == char)) {
        return true
    } else if (tablero[2][0] == char && (tablero[2][1] == char && tablero[2][2] == char)) {
        return true
    }
    //verticales
    else if (tablero[0][0] == char && (tablero[1][0] == char && tablero[2][0] == char)) {
        return true
    } else if (tablero[0][1] == char && (tablero[1][1] == char && tablero[2][1] == char)) {
        return true
    } else if (tablero[0][2] == char && (tablero[1][2] == char && tablero[2][2] == char)) {
        return true
    }
    //diagonales
    else if (tablero[0][0] == char && (tablero[1][1] == char && tablero[2][2] == char)) {
        return true
    } else if (tablero[0][2] == char && (tablero[1][1] == char && tablero[2][0] == char)) {
        return true
    }
    //no hay nada
    return false
}

private fun resultado(tablero: MutableList<MutableList<Char>>): String {
    if (tresEnLinea(tablero, 'X')) {
        return "X wins"
    } else if (tresEnLinea(tablero, 'O')) {
        return "O wins"
    } else if (tablero.toString().contains('_')) {
        return "Game not finished"
    }
    return "Draw"

}

fun imprimirCuadricula(tablero: MutableList<MutableList<Char>>) {
    println("---------")
    println("| ${tablero[0][0]} ${tablero[0][1]} ${tablero[0][2]} |")
    println("| ${tablero[1][0]} ${tablero[1][1]} ${tablero[1][2]} |")
    println("| ${tablero[2][0]} ${tablero[2][1]} ${tablero[2][2]} |")
    println("---------")
}