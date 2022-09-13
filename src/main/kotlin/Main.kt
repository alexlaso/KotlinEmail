fun main() {
    val patron = """^[A-Za-z0-9._]+@[A-Za-z]+\\.[A-Za-z]{2,3}\$""".toRegex()
    do {
        println("Introduce un e-mail")
        val prueba = readln()
        var email = prueba.matches(patron)
    }while(!email)
}