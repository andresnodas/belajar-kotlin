package app

fun main() {

    val names = listOf("Eko", "Kurniawan", "Khannedy")
    println(names.first())
    println(names.last())
    println(names.elementAt(1))
    println(names.elementAtOrNull(10))
    println(names.elementAtOrElse(2) { "Tidak Ada" } )
    println(names.elementAtOrElse(10) { "Tidak Ada" } )

}