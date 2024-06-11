package data

open class Teacher(
    val name: String
) {
    private fun teach() {
        println("Teach !")
    }

    protected fun test() {
        println("Test")
    }
}

class SuperTeacher(
    name: String
): Teacher(name) {

    fun test2() {
        super.test()
    }

}