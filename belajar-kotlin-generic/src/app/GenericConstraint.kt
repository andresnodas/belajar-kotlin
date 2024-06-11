package app

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, I'm vice president")
    }
}

//Hanya mengijinkan class Employee dan turunannya
//Bila kita tidak sebutkan defaultnya adalah : Any
class Company<T : Employee>(val employee: T)

//Bila ingin generic typenya adalah Employee dan CanSayHello (lebih dari 1) menggunakan kata kunci 'where'
class Company2<T>(val employee: T) where T: Employee, T: CanSayHello

fun main() {
    val data1 = Company(Employee())
    val data2 = Company(Manager())
    val data3 = Company(VicePresident())

//    val data4 = Company2(Employee()) //Error
//    val data5 = Company2(Manager()) // Error
    val data6 = Company2(VicePresident()) //Hanya VicePresident yang implement CanSayHello
}