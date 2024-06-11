fun toUpper(value: String): String = value.uppercase()

fun main() {

    //Membuat lambda
    val lambdaName: (String, String) -> String = { firstName: String, lastName: String ->
        //Kita tidak perlu menggunakan kata kunci return
        //Baris terakhir dari lambda akan di jadikan return valuenya
        val result = "$firstName $lastName"
        result
    }

    val name = lambdaName("Eko", "Kurniawan")
    println(name)

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    println(sayHello("Eko"))

    val lambdaUpper: (String) -> String = ::toUpper
    println(lambdaUpper("Eko Kurniawan"))

}