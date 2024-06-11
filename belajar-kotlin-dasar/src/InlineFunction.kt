inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun hello2(
    firstName: () -> String,
    //Membuat parameter yang tidak inline
    noinline lastName: () -> String,
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
//    println(hello { "Eko" })
//    println(hello { "Kurniawan" })

    for (i in 0..100) {
        println(hello { "Eko" })
    }

    hello2({ "Eko" }, { "Kurniawan" })
}