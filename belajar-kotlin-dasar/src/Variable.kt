const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    // Secara default variable harus diisi tidak bisa null
    val firstName: String = "Eko"
    // Deklarasi tipe data variable itu optional di kotlin
    var lastName = "Khannedy"

    println(firstName)
    println(lastName)

//    Error saat ingin mengubah variable
//    firstName = "Andres"
    //Mengubah variable
    lastName = "Kurniawan Khannedy"

    println(firstName)
    println(lastName)

    // Bila variable bisa menyimpan null gunakan ? Setelah tipe datanya
    var firstNameNull: String? = "Eko"
    firstNameNull = null

    // Error karena mengakses method variable yang bisa null harus menggunakan ?
//    println(firstNameNull.length)
    println(firstNameNull?.length)

    println(APP)
    println(VERSION)
}