package app

import data.Function

fun main() {
    val function = Function("Eko")

    function.sayHello<String>("Joko")

    function.sayHello<Int>(10)

}