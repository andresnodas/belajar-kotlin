package app

fun main() {
    val list1 = listOf("Eko", "Kurniawan", "Khannedy")
    val list2 = listOf("Programmer", "Zaman")

    val list3 = list1.zip(list2)
    val list4 = list1.zip(list2) { data1, data2 ->
        data1 + data2
    }

    println(list3)
    println(list4)
}