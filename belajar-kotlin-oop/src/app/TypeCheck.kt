package app

import data.HandPhone
import data.Laptop

fun printObject(any: Any) {
    /**
    if (any is Laptop) { //Kotlin melakukan Smart Cast
                        // Di dalam if object any akan menjadi Laptop
        println("Laptop ${any.name}")
    } else if (any is HandPhone) {
        println("Handphone ${any.name}")
    } else {
        println(any)
    }
    **/

    when(any) {
        is Laptop -> println("Laptop ${any.name}") //Kotlin melalukan Smart Cast
        is HandPhone -> println("HandPhone ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value : String = any as String //Unsafe cast will throw exception if failed cast
    println(value)
}

fun printStringSafe(any: Any) {
    val value : String? = any as? String //Will return null if failed cast
    println(value)
}

fun main() {
    printObject("Eko")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(HandPhone("Samsung"))

    printString("Eko")
//    printString(1) // Error

    printStringSafe("Eko")
    printStringSafe(1) // null
}