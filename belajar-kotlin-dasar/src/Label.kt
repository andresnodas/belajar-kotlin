fun main() {

    /*loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) {
                break@loopI
            }

            println("$i $j = ${i * j}")
        }
    }*/

    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }

            println("$i $j = ${i * j}")
        }
    }

    fun test(name: String, param: (String) -> Unit): Unit = param(name)

    test("eko") testLabel@{
        if (it == "eko") {
            return@testLabel
        }
        println(it)
    }

    println("Kurniawan")

}