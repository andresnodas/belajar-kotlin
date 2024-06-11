fun main() {

    fun hello(value: String, transformer: (String) -> String): String {
        return "Hello ${transformer(value)}"
    }

    val upperTransformer = { value: String -> value.uppercase() }
    val lowerTransformer = { value: String -> value.lowercase() }

    println(hello("Eko", upperTransformer))
    println(hello("Kurniawan", lowerTransformer))

    // Trailing lambda
    // Bisa digunakan bila parameter lambdanya ada di terakhir
    println(hello("Budi") { value: String ->
        "Test $value"
    })

    println(hello("nugraha") {
        "Test 2 $it"
    })

}