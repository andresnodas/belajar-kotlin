package app

fun main() {

    val names = listOf("Eko", "Kurniawan", "Khannedy")
    val (listMatch, listNotMatch) = names.partition { it.length > 5 }

    println(names)
    println(listMatch)
    println(listNotMatch)

}