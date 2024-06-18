package app

fun main() {

    val list1 = listOf("Eko", "Kurniawan", "Khannedy")
    val list2 = list1.filter { it.length > 5 }
    val list3 = list1.filterIndexed {index, value -> index % 2 == 0 }

    val list4: List<Any?> = listOf(null, 1, "Eko", "Kurniawan", 2, null)
    val listString = list4.filterIsInstance<String>()
    val listInt = list4.filterIsInstance<Int>()
    val listNotNull = list4.filterNotNull()

    println(list2)
    println(list3)
    println(listString)
    println(listInt)
    println(listNotNull)

}