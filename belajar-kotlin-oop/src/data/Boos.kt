package data

class Boos(val boosName: String) {

    class Employee(val name: String) {

        fun hi() {
//            Bila Employee class tidak menggunakan kata kunci "inner" tidak bisa akses outer classnya
//            println("Hi, my name is $name, and my boss name is $boosName") //Error
            println("Hi, my name is $name") //Error
        }

    }

    inner class Employee2(val name: String) {

        fun hi() {
            println("Hi, my name is $name, and my boss name is $boosName or ${this@Boos.boosName}")
        }

    }

}