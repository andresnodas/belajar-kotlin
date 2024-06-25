package app

fun main() {
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val lengthsList = words
        .filter { println("filter $it"); it.length > 3 }
        .map { println("length $it"); it.uppercase() }
        .take(4)

    println("Lengths of first 4 words longer than 3 chars")
    println(lengthsList)

    val words2 = "The quick brown fox jumps over the lazy dog".split(" ")
    val wordsSequence = words2.asSequence()
    val lengthsList2 = wordsSequence
        .filter { println("filter $it"); it.length > 3 }
        .map { println("uppercase $it"); it.uppercase() }
        .take(4)

    println("Lengths of first 4 words longer than 3 chars")
    println(lengthsList2.toList())
}