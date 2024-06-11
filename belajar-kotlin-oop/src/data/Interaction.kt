package data

interface Interaction {
    val name: String
    fun sayHello(name: String)
    //Di interface kita bisa membuat method dengan body
    fun sayHello2(name: String) {
        println("Hello 2 $name, my name is ${this.name}")
    }
}

interface Go: Interaction {
    fun go() {
        println("Go!")
    }
}

interface ContohInterface: Interaction, Go //Inheritance antar interface

open class Contoh

interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

class Human(
    override val name: String
): Contoh(), Go, MoveA, MoveB { //Kita bisa mewarisi beberapa interface, tapi hanya boleh 1 class
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Move Human")
    }

}