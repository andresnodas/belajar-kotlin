package app

class Covariant<out T>(
    //Tidak bisa berupa var, dia hanya bisa sebagai output tidak bisa menjadi input
    val data: T
) {

    fun data(
        //Tidak bisa digunakan sebagai parameter karena ini berupa input juga
//        param: T
    ): T {
        return data
    }

}

fun main() {
    val covariantString = Covariant<String>("Eko")
    val covariantAny: Covariant<Any> = covariantString

    covariantAny.data()
    println(covariantAny.data)
}