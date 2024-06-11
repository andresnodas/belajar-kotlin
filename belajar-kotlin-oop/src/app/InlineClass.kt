package app

import data.Token

fun main() {
    //Bila di decompile ke java, ini bukan sebuah class
    //Class token akan memiliki banyak static method yang nanti bisa digunakan
    val token = Token("ini token")
    println(token.value)
    println(token.toUpper())
}