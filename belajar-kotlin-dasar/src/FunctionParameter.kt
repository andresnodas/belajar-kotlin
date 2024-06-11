//Secara default variable adalah val
fun sayHello(firstName: String, lastName: String?) {
    when {
        lastName == null -> println("Hello $firstName")
        else -> println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Eko", "Khannedy")
    sayHello("Budi", null)
    sayHello("Joko", "Nugraha")
}