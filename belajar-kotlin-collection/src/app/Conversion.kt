package app

fun main() {
    val array = arrayOf(10, 3, 5, 7, 2, 9, 1, 8)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableList = range.toMutableList()
    val mutableSet = range.toMutableSet()

    val listToMutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()

    val sortedSet = array.toSortedSet()
}