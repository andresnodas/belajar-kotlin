package app

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayCollection(listOf("Eko", "Kurniawan", "Khannedy"))
    displayCollection(mutableListOf("Eko", "Kurniawan", "Khannedy"))
    displayCollection(setOf("Eko", "Kurniawan", "Khannedy"))
    displayCollection(mutableSetOf("Eko", "Kurniawan", "Khannedy"))
    displayCollection(mapOf("Eko" to "Kurniawan").entries)
//    displayCollection(mapOf("Eko" to "Kurniawan")) //Error map bukan turunan collection
}