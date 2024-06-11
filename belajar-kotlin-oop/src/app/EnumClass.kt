package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val all = Gender.entries.toTypedArray()

    println(man)
    println(woman)
    println(all.toList())

    man.showDescription()
    woman.showDescription()
}