package app

fun main() {
    val map = mapOf(
        "a" to "Eko",
        "b" to "Kurniawan",
        "c" to "Khannedy",
    )

    println(map.getValue("a"))
    println(map.getOrElse("d") { "Ups" })
    println(map.filter { (key, value) -> value.length > 5 })
    println(map.filterKeys { key -> key > "b" })
    println(map.filterValues { it.length > 5 })
}