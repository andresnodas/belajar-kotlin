package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(name: Int) {
        println("Hello $name, My Name is $firstName")
    }

    fun sayHello(firstName: String, lastName: String) {
        //Untuk mengakses properties object sendiri di rekomendasikan menggunakan this
        println("Hello $firstName $lastName, My Name is ${this.firstName}")
    }

    fun run() {
        println("I'm Run")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}