fun main() {

    val nilai = 'C'

    when (nilai) {
        'A' -> println("Amazing")
        'B' -> {
            println("Good")
        }
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try again next year")
        else -> println("Ups")
    }

    when (nilai) {
//      when dengan multiple options
        'A', 'B', 'C' -> println("Pass")
        else -> {
            println("Not Pass")
        }
    }

    val nilaiLulus = arrayOf('A', 'B', 'C')
    when (nilai) {
        in nilaiLulus -> println("Selamat anda lulus")
        !in nilaiLulus -> println("Maaf tidak lulus")
//        else -> println("Maaf tidak lulus")
    }

    val name = "Eko"
    when (name) {
        is String -> println("This is String")
        !is String -> println("This is not String")
    }

    val examValue = 90
    when {
        examValue > 80 -> println("Good job")
        examValue > 60 -> println("Not bad")
        else -> println("Try again next year")
    }

}