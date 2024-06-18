package app

fun main() {

    val list = listOf("Eko", "Kurniawan", "Eko", "Khannedy")
    val map1 = list.associate { Pair(it, it.length) }
    val map2 = list.associateWith { it.length }
    val map3 = list.associateBy { it.length }

    println(map1)
    println(map2)
    println(map3)

}