package app

import data.Application2

fun main() {
    //Alias companion tidak perlu di deklarasikan
    println(Application2.Companion.toUpper("Eko"))
    println(Application2.toUpper("Eko"))
}