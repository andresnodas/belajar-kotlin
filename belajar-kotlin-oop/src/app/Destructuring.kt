package app

import data.Boos
import data.Game
import data.Login
import data.MinMax

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

typealias LoginCallback = (Login) -> Boolean
fun login(login: Login, callback: LoginCallback): Boolean {
    return callback(login)
}

fun main() {
    val game = Game("Game Kotlin", 10_000)
//    val name = game.name
//    val price = game.price

    //Tidak perlu membuat variable satu per satu
    val (name, price) = game

    println(name)
    println(price)

    val result = minmax(10, 100)
    val min = result.min
    val max = result.max

    //Using destructure
    val (min2, max2) = minmax(50, 30)
    println(min2)
    println(max2)

    //Menggunakan underscore untuk mengignore variable yang tidak digunakan
    val (min3, _) = minmax(10, 20)

    val dataLogin = Login("eko", "rahasia")
    login(dataLogin) { login ->
        login.username == "eko" && login.password == "rahasia"
    }

    //Destructuring di lambda function
    login(dataLogin) { (username, password) ->
        username == "eko" && password == "rahasia"
    }
}