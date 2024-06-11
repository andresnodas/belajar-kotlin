package data

//Default class di kotlin adalah final (tidak bisa di turunkan)
//Gunakan kata kunci open untuk bisa menurunkan classnya
open class Employee(
    val name: String
) {

    //Sama seperti class, function secara default adalah final
    //Agar functionnya bisa di override harus di beri kata kunci open
    open fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.name}")
    }

}

//Child class secara default akan final juga
//Perlu menggunakan kata kunci open agar bisa di turunkan
// Class child akan memiliki properties dan function dari class Employee
class Manager(name: String): Employee(name) {
    //Gunakan kata kunci override untuk mengoverride method yang ada pada parent
    override fun sayHello(name: String) {
        println("Hello $name, My Name is Manager ${this.name}")
    }
}

open class VicePresident(name: String): Employee(name) {
    //Bila class bisa di turunkan maka secara default override method menjadi open
    //Agar tidak bisa di override oleh turunannya perlu menggunakan final
    final override fun sayHello(name: String) {
        println("Hello $name, My Name is Vice President ${this.name}")
    }
}

class GeneralVicePresident(name: String): VicePresident(name) {
    /*
    Tidak bisa di override lagi
    override fun sayHello(name: String) {
        super.sayHello(name)
    }*/
}