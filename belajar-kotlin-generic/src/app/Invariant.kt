package app

class Invariant<T>(var data: T)

fun main() {
    val invariantString = Invariant("String")
//    val invariantAny: Invariant<Any> = invariantString // Error generic tidak bisa melakukan polymorphism
//    Tidak bisa di subtitute oleh parent atau child classnya
//    invariantAny.data = 100 //Bahaya asalnya String tipe datanya berubah jadi Int
}