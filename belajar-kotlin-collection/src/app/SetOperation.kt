package app

fun main() {
    val numbers1 = (1..10).toSet()
    val numbers2 = (6..15).toSet()

    println(numbers1 union numbers2)
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
    println(numbers1 intersect numbers2)
    //[6, 7, 8, 9, 10]
    println(numbers1 subtract numbers2)
    //[1, 2, 3, 4, 5]
    println(numbers2 subtract numbers1)
    // [11, 12, 13, 14, 15]
}