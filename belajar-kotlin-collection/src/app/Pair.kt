package app

fun main() {

    val pair = Pair("Eko", "Kurniawan")
    println(pair.first)
    println(pair.second)

    val pair2: Pair<String, String> = "Eko" to "Kurniawan"
    println(pair2.first)
    println(pair2.second)

}