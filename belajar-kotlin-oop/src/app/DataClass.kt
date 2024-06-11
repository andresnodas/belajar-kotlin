package app

import data.Product

fun main() {
    val product1 = Product("Indomie", 2500, "Food")
    val product2 = product1.copy()

    val product3 = product1.copy(
        name = "Supermie"
    )

    println(product1)
    println(product3)
    println(product1 == product2)
    println(product1.hashCode() == product2.hashCode())
}