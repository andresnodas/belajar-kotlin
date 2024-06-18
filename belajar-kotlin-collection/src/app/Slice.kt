package app

fun main() {

    val list1 = (0..100).toList()
    val list2 = list1.slice(0..50) // Get data dari index 0 ke 50
    val list3 = list1.slice(0..100 step 2)
    val list4 = list1.slice(100  downTo 0 step 2)

    println(list1)
    println(list2)
    println(list3)
    println(list4)

}