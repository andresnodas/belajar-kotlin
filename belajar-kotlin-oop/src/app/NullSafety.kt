package app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//    println("Hello ${friend?.name}") // Harus menggunakan ? untuk mengakses name
    if (friend != null) {
        // Dalam if block friend di anggap tidak null oleh kotlin secara otomatis
        // Kita tidak perlu menggunakan ? untuk mengakses name
        println("Hello1 ${friend.name}")
    }
}

fun sayHello2(friend: Friend?) {
    val name = friend?.name ?: "" // Ini adalah Elvis Operator, bila null maka defaultnya akan ""
    println("Hello2 $name")
}

fun sayHello3(friend: Friend?) {
    val name = friend!!.name // Operator !! memaksa data menjadi tidak null dan apabila null dia akan throw NPE
    println("Hello3 $name")
}

fun main() {
    sayHello(Friend("Eko"))
    sayHello(null)

    sayHello2(Friend("Eko"))
    sayHello2(null)

    sayHello3(Friend("Eko"))
    sayHello3(null) // Throw NPE
}