package data

class Application2(
    val name: String
) {

    companion object {
        //Inner object tidak bisa mengakses outer object/class
        fun toUpper(name: String): String {
            return name.uppercase()
        }
    }

}