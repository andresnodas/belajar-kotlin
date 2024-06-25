package app

fun main() {
    val numbers = (1..100).toList().shuffled()

    val max = numbers.reduce { first, second ->
        if (first > second) first
        else second
    }

    val min = numbers.reduce { first, second ->
        if (first < second) first
        else second
    }

    val sum = numbers.fold(0) { accumulator, iterator ->
        accumulator + iterator
    }

    println(max)
    println(min)
    println(sum)

    val names = listOf("Eko", "Kurniawan", "Khannedy")

    val count = names.fold(0) { first, second ->
        first + second.length
    }

    println(count)
}