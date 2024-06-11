package app

import data.Application

typealias App = Application
typealias Aplikasi = App
//Bila ada nama yang sama tapi di package yang berbeda
typealias App2 = data2.Application

//Type alias juga bisa digunakan untuk function
typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Aplikasi Kotlin")

    val app2 = App2("Kotlin App 2")

    sayHello { "Eko" }
}