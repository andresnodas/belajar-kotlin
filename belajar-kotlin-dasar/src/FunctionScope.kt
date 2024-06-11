fun satu() {
//    Error
//    contohHelloWorld()
}

fun dua() {
//    Error
//    contohHelloWorld()
}

fun main() {
    //Method ini hanya bisa di akses oleh main method saja
    fun contohHelloWorld() {
        println("Hello World")
    }

    contohHelloWorld()
}