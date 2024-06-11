package app

import data.Cat
import data.Dog

fun main() {
    val cat = Cat()
    cat.run()
    println(cat.name)

    val dog = Dog()
    dog.run()
    println(dog.name)
}