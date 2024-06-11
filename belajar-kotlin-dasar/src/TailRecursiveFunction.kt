fun main() {

    fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1)
        }
    }

//    Error Stack Overflow
//    display(100_000)

    tailrec fun display2(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display2(value - 1)
        }
    }

    display2(100_000)

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(15))

}