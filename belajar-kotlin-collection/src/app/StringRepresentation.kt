package app

fun main() {
    val names = listOf("Eko", "Kurniawan", "Khannedy")

    val names1 = names.joinToString(" ", "|", "|")
    val names2 = names.joinToString(" ", "|", "|") { "Item $it" }

    println(names1)
    println(names2)

    val appendable = StringBuilder()
    names.joinTo(appendable, " ", "|", "|") { it }
    names.joinTo(appendable, " ", ">", "<") { it }
    names.joinTo(appendable, " ", "@", "@") { it }
    println(appendable.toString())

    val numbers = (1..10).toList()

    println(numbers.joinToString(", "))

}