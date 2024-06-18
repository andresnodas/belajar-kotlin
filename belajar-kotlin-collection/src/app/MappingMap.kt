package app

fun main() {

    val map: Map<Int, String> = mapOf(
        1 to "Eko",
        2 to "Kurniawan",
        3 to "Khannedy"
    )
    val map2 = map.mapKeys { it.key * 10 }
    val map3 = map.mapValues { it.value.uppercase() }

    println(map2)
    println(map3)
}