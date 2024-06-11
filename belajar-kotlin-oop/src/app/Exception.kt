package app

import exception.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    }

    println("Hello $name")
}

fun main() {
    try {
        validateAndSayHello("eko")
        validateAndSayHello("")
        println("Program") // tidak akan di eksekusi karena terkena exception
    } catch (error: ValidationException) {
        println("Error with message ${error.message}")
    } catch (error: Throwable) { //Kita bis memiliki multiple catch dengan jenis Exception yang berbeda
        println("Error with message ${error.message}")
    } finally {
        println("Program selesai") // Ini akan di eksekusi baik ada error atau tidak
    }

}