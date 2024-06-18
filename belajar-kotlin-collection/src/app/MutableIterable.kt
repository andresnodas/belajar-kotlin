package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator: MutableIterator<T> = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
//        iterator.remove() //remove value
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Eko", "Kurniawan", "Khannedy"))
    displayMutableIterable(mutableSetOf("Eko", "Kurniawan", "Khannedy"))
}