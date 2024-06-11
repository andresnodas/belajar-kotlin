infix fun String.to(type: StringType): String {
    if (type == StringType.UP) {
        return this.uppercase()
    }

    return this.lowercase()
}

fun main() {
    val result: String = "Eko" to StringType.UP
    println(result)
}

enum class StringType {
    UP, DOWN
}