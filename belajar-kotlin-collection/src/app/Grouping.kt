package app

fun main() {
    val list = listOf("a", "a", "b", "b", "c", "c", "aa", "aa", "bb", "abc")
    val map = list.groupBy { it }
    val map2= list.groupBy { it.length }
    val grouping = list.groupingBy { it } //Detail ada di materi Grouping Interface

    println(map)
    println(map2)
    println(grouping)
}