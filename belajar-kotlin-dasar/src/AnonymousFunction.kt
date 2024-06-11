fun main() {

    fun hello(value: String, transformer: (String) -> String): String {
        return "Hello ${transformer(value)}"
    }

    val anonymousFunction = fun(value: String): String {
        if (value.isBlank()) {
            return "Ups"
        }

        return value.uppercase()
    }

    println(hello("Eko", anonymousFunction))
    println(hello("", anonymousFunction))

    println(hello("Kurniawan", fun(value: String): String {
        return value.lowercase()
    }))
}