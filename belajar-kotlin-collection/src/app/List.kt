package app

fun main() {
    val list = listOf<String>("Eko", "Kurniawan", "Khannedy")

    println(list.get(0))
    println(list[1])
    println(list[2])
    println(list.indexOf("Kurniawan"))
    println(list.indexOf("Tidak Ada"))
    println(list.contains("Eko"))
    println(list.contains("Tidak Ada"))
    println(list.containsAll(listOf("Eko", "Khannedy")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}