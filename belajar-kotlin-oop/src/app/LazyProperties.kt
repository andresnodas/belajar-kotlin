package app

import data.Account

fun main() {
    val account = Account()
    println(account.name) //Lazy hanya akan di call sekali
    println(account.name)
    println(account.name)
}