package data

data class Student(
    val name: String,
    val age: Int,
)

//Extension function ini bukan bagian dari class, jadi tidak bisa akses private atau protected
fun Student?.sayHello(name: String) {
//    println("Hello $name, my name is ${this.name}, and my age is ${this.age}") //Error for ${this.age}
    if (this != null) {
        println("Hello $name, my name is ${this.name}")
    }
}

val Student.upperName : String
    get() = this.name.uppercase()