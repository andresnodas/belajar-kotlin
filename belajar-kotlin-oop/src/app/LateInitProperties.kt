package app

import data.Television

fun main() {
    val tv = Television()
//    println(tv.brand) // Error

    tv.brand = "Samsung" //Ini juga bisa dilakukan
    tv.initTelevision("Samsung")
    println(tv.brand)
}