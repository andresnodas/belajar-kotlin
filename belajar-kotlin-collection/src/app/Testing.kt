package app

fun main() {

    val names = listOf("Eko", "Kurniawan", "Khannedy")

    println(names.any { it.length > 5 })
    println(names.none { it.length > 5 })
    println(names.all { it.length > 5 })
    println(names.any())
    println(names.none())

}