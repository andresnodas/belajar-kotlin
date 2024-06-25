package app

fun main() {
    val numbers = (1..10).toList()

    //shuffled method will create new collection
    println(numbers.shuffled())
    println(numbers.shuffled())
    println(numbers.shuffled())
    println(numbers.shuffled())
}