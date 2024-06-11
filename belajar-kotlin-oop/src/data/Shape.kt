package data

open class Shape {
    open val corner: Int = -1

    open fun printName() {
        println("This is Shape")
    }
}

class Rectangle: Shape() {
    override val corner: Int = 4
    val parentCorner: Int = super.corner //super.super tidak bisa digunakan

    override fun printName() {
        println("This is Rectangle")
        super.printName()
    }
}

class Triangle: Shape() {
    override val corner: Int = 3
}