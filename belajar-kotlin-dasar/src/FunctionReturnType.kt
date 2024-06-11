fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun div(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    }

    val result = a / b
    return result
}

fun main() {
    val result = sum(10, 10)
    println(result)

    println(sum(200, 100))

    println(div(100, 10))
    println(div(100, 0))
}