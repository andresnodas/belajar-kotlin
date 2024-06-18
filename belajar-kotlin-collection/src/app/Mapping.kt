package app

fun main() {

    val list: List<String> = listOf("Eko", "Kurniawan", "Khannedy")

    val list2 = list.map { value -> value.uppercase() }
    println(list2)

    val list3: List<Int> = list.map { it.length }
    println(list3)

    val set: Set<String> = setOf("Eko", "Kurniawan", "Khannedy")

    val set2 = list.map { value -> value.lowercase() }
    println(set2)

    val names = listOf("Eko", "Budi", "Joko", "Dani", "Andi", "Hendri")
    val namesGanjil = names.mapIndexedNotNull { index, value ->
        if (index % 2 == 0) null
        else value
    }

    println(namesGanjil)

    val numbers = (1..100).toList()
    val ganjil = numbers.mapNotNull {
        if (it % 2 == 0) null else it
    }
    println(ganjil)

}