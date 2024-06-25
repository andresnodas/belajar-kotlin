package app

fun main() {
    val names = listOf("Eko", "Kurniawan", "Khannedy")

    println(names.getOrNull(1))
    println(names.getOrElse(5) { i -> "Ups $i" })
    println(names.subList(0, 2))

    val sortedNames = names.sorted()
    println(sortedNames.binarySearch("Khannedy"))

    val numbers = listOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { it > 3 })
}