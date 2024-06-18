package app

class Member(
    val name: String,
    val hobbies: List<String>
)

fun main() {

    val list = listOf(
        listOf("Eko", "Kurniawan", "Khannedy"),
        listOf("Programmer", "Zaman", "Now")
    )

    println(list.flatten())

    val members = listOf(
        Member("Eko", listOf("Reading", "Coding")),
        Member("Budi", listOf("Gaming", "Traveling"))
    )

    val hobbies = members.map { it.hobbies }.flatten()
    val hobbies2 = members.flatMap { it.hobbies }

    println(hobbies)
    println(hobbies2)

}