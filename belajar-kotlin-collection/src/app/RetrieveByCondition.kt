package app

fun main() {

    val range = (1..20).toList()
    println(range.first { it > 10})
    println(range.last { it > 10 })
    println(range.firstOrNull { it > 50 })
    println(range.lastOrNull { it > 50 })
    println(range.find { it > 50 })
    println(range.findLast { it > 50 })

}