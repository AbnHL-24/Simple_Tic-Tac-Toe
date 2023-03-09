fun main() {
    val numeros = "1234567890"
    val letrasMinusculas = "qwertyuiopasdfghjklzxcvbnm"
    val letrasMayusculas = "HJKLYUIOPNMTREWQGFDSABVCXZ"
    val complemento = "p3${letrasMayusculas}${letrasMinusculas}"
    val entrada = readln()
    val cantidades = entrada.split(" ")
    var contraseña = ""

    //letras mayusculas
    repeat(cantidades[0].toInt() / 26) {
        repeat(26) {
            contraseña += letrasMayusculas[it]
        }
    }
    repeat(cantidades[0].toInt() % 26) {
        contraseña += letrasMayusculas[it]
    }
    //letras minusculas
    repeat(cantidades[1].toInt() / 26) {
        repeat(26) {
            contraseña += letrasMinusculas[it]
        }
    }
    repeat(cantidades[1].toInt() % 26) {
        contraseña += letrasMinusculas[it]
    }
    //numeros
    repeat(cantidades[2].toInt() / 10) {
        repeat(10) {
            contraseña += numeros[it]
        }
    }
    repeat(cantidades[2].toInt() % 10) {
        contraseña += numeros[it]
    }
    //complemento
    if (contraseña.length < cantidades[3].toInt()) {
        repeat((cantidades[3].toInt() - contraseña.length) / 54) {
            repeat(54) {
                contraseña += complemento[it]
            }
        }
        repeat((cantidades[3].toInt() - contraseña.length) % 54) {
            contraseña += complemento[it]
        }
    }

    println(contraseña)
}