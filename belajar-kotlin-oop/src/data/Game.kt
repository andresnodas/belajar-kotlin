package data

data class Game(
    val name: String,
    val price: Int,
) {
//    Kita tidak perlu membuat operator function secara manual bila menggunakan data class untuk destructuring
//    operator fun component1(): String = name
//    operator fun component2(): Int = price
}