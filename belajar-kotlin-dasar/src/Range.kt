fun main() {

    val range = 0..1000
    println(range)

    println(range.count())
    println(range.contains(100))
    println(range.first)
    println(range.last)
    println(range.step)

    val rangeDown = 1000 downTo 0

    val range1 = 0..1000 step 5
    val range2 = 1000 downTo 0 step 5

}