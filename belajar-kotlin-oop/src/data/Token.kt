package data

//Inline class harus memiliki 1 properties
inline class Token(
    val value: String
) {
    fun toUpper(): String = value.uppercase()
}