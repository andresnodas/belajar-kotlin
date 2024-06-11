package app

class Contravariant<in T> {

    fun sayHello(
        name: T
    ) //Generic type tidak bisa digunakan untuk return value, hanya bisa sebagai input
    {
        println("Hello $name")
    }

}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    //Parameternya menjadi String
    contravariantString.sayHello("Eko")
}