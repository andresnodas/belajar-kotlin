package data

class Application(
    val name: String
) {

    object Utilities {
        //Inner object tidak bisa mengakses outer object/class
        fun toUpper(name: String): String {
            return name.uppercase()
        }
    }

}