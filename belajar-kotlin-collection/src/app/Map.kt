package app

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Eko"),
        "b" to "Kurniawan",
        "c" to "Khannedy"
    )

    println(map.keys)
    println(map.values)

    for ((key, value) in map) {
        println("$key to $value")
    }
}