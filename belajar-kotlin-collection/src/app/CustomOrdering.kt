package app

data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(
        Fruit("Apple", 5),
        Fruit("Orange", 5),
        Fruit("Banana", 20)
    )

    println(fruits.sortedBy { it.name })
    println(fruits.sortedByDescending { it.quantity })
    println(fruits.sortedWith(compareBy<Fruit> { it.quantity }.thenBy { it.name }))
    println(fruits.sortedWith(compareByDescending { it.quantity }))
    println(fruits.sortedWith(Comparator { a, b -> a.quantity.compareTo(b.quantity) }))
}