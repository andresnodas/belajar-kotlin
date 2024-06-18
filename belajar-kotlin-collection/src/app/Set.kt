package app

import data.Person

fun main() {
    val set : Set<Person> = setOf(
        Person("Eko"),
        Person("Kurniawan"),
        Person("Eko"),
        Person("Khannedy"),
    )

    println(set.size)
    println(set.contains(Person("Eko")))

    for (person in set) {
        println(person.name)
    }
}