package app

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayMutableCollection(mutableListOf("Eko", "Kurniawan", "Khannedy"))
    displayMutableCollection(mutableSetOf("Eko", "Kurniawan", "Khannedy"))
    displayMutableCollection(mutableMapOf("Eko" to "Kurniawan").entries)
}