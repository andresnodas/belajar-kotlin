package app

import data.Human

fun main() {
    val human = Human("Eko")
    human.sayHello("Budi")
    human.sayHello2("Joko")
    human.go()
    human.move()
}