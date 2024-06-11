package data

interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Goodbye $name")
    }
}

class MyBaseDelegate(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }

    override fun sayGoodbye(name: String) {
        base.sayGoodbye(name)
    }
}

//Ini sama dengan class MyBaseDelegate
class Delegate(val base: Base): Base by base {
    //Bila tidak ingin semua di override secara otomatis kita bisa tetap melakukannya secara manual
    override fun sayHello(name: String) {
        println("Hi $name")
    }
}