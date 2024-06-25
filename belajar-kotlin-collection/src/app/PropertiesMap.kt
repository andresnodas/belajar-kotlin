package app

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: Int by map
}

fun main() {
    //Bila key name atau version tidak ada akan error
    val map = mapOf(
        "name" to "Belajar Kotlin",
        "version" to 1,
        "salah" to 2, // Akan diabaikan
    )

    val app = Application(map)

    println(app.name)
    println(app.version)
}