package app

fun <T> displayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun main() {
    displayIterable(listOf("Eko", "Kurniawan", "Khannedy"))
    displayIterable(setOf("Eko", "Kurniawan", "Khannedy"))
}