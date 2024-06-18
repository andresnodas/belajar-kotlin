package app

fun main() {

    //Operator + atau - akan membuat collection baru

    val list1 = listOf("Eko", "Kurniawan", "Khannedy")
    val list2 = list1 + "Programmer"
    val list3 = list1 + listOf("Programmer", "Zaman", "Now")
    val list4 = list1 - "Eko"
    val list5 = list1 - listOf("Kurniawan", "Khannedy")

    val map1 = mapOf("a" to "Eko", "b" to "Kurniawan")
    val map2 = map1 + ("c" to "Khannedy")
    val map3 = map1 - "a"

    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(list5)

    println(map1)
    println(map2)
    println(map3)

}