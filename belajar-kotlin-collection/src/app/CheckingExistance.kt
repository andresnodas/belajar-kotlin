package app

fun main() {
    val range = (1..10).toSet()

    println(range.contains(5))
    println(range.containsAll(listOf(3,4,5)))
    println(range.isEmpty())
    println(range.isNotEmpty())
}