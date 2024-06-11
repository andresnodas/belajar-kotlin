package data

//Bila class function memiliki generic type Function<T>
//Generic type T akan di override oleh method sayHello
class Function(
    val name: String
) {

    fun <T> sayHello(param: T) {
        println("Hello $param, my name is $name")
    }

}