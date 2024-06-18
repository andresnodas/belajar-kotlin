package app

class TypeErasure<T>(param: T) {
    private var data: T = param

    fun getData(): T = data
}

fun main() {
    val data1 = TypeErasure<String>("Eko")
    val dataString: String = data1.getData()

    val data2: TypeErasure<Int> = data1 as TypeErasure<Int>
    val dataInt = data2.getData()

    println(dataString)
    println(dataInt)
}