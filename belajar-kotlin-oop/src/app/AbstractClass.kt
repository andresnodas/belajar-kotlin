package app

import data.City
import data.Country
import data.Location

fun main() {
//    val location = Location("Subang") // Error
    val city = City("Subang")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}