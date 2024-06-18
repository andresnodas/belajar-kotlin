package app

fun main() {
    val list = listOf(
        "Eko" to "Programmer",
        "Kurniawan" to "Zaman",
        "Khannedy" to "Now"
    )

    val unzip = list.unzip()

    println(unzip.first)
    println(unzip.second)

    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)
}