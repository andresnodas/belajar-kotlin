package app

import data.Company

fun main() {
    val company1 = Company("eko")
    val company2 = Company("eko")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}