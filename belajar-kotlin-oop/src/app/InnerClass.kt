package app

import data.Boos

fun main() {
    val employee = Boos.Employee("Eko")
    employee.hi()

    val boos = Boos("Eko")

    val employee1 = boos.Employee2("Joko")
    val employee2 = boos.Employee2("Budi")

    employee1.hi()
    employee2.hi()
}