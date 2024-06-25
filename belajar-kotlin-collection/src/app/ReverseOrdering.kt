package app

fun main() {
    val names = mutableListOf("Eko", "Kurniawan", "Khannedy")
    val listReversed = names.reversed()
    val listAsReversed = names.asReversed()

    println(listReversed) // [Khannedy, Kurniawan, Eko]
    println(listAsReversed) // [Khannedy, Kurniawan, Eko]

    names.add("Programmer")

    println(listReversed) // [Khannedy, Kurniawan, Eko]
    println(listAsReversed) // [Programmer, Khannedy, Kurniawan, Eko]
}