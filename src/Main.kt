fun main() {
    val coche1 = Coche("Rojo", "Toyota", "Corolla", 150, 4, "1234567")
    println(coche1)

    coche1.color = "Azul"
    println(coche1)

    // Prueba de validaciones
    try {
        coche1.numCaballos = 50
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        coche1.numPuertas = 2
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        coche1.matricula = "123456"
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
