package app

fun main() {
    listOf("Eko", "Kurniawan", "Khannedy").forEach {
        println(it)
    }

    mutableListOf("Eko", "Kurniawan", "Khannedy").forEachIndexed { index, value ->
        println("$index : $value")
    }

    setOf("Eko", "Kurniawan", "Khannedy").forEach {
        println(it)
    }

    mutableSetOf("Eko", "Kurniawan", "Khannedy").forEachIndexed { index, value ->
        println("$index : $value")
    }
}