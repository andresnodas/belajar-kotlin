package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Eko")
    println(premiumCustomer.name)
    println(premiumCustomer.type)
    println(premiumCustomer.balance)

    val executiveCustomer = ExecutiveCustomer("Kurniawan", 10_000)
    println(executiveCustomer.name)
    println(executiveCustomer.type)
    println(executiveCustomer.balance)

}