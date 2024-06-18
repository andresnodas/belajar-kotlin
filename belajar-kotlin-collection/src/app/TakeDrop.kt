package app

fun main() {
    val chars = ('a'..'z').toList()

    println(chars.take(3))
    println(chars.takeWhile { it < 'f' })
    println(chars.takeLast(2))
    println(chars.takeLastWhile { it > 'w' })

    println(chars.drop(23))
    println(chars.dropLast(23))
    println(chars.dropWhile { it < 'x' })
    println(chars.dropLastWhile { it > 'c' })
}