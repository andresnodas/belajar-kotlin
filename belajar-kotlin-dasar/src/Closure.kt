fun main() {

    var counter: Int = 0
    val lambaIncrement: () -> Unit = {
        println("Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Increment")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambaIncrement()
    anonymousIncrement()
    functionIncrement()

    println("Counter $counter")

}