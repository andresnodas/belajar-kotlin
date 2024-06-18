package app

import data.Person

fun main() {

    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Eko"))
    mutableSet.add(Person("Kurniawan"))
    mutableSet.add(Person("Eko"))
    mutableSet.add(Person("Khannedy"))

    println(mutableSet.size)
    println(mutableSet.contains(Person("Eko")))

    for (person in mutableSet) {
        println(person.name)
    }

}