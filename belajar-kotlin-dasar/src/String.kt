fun main() {

    var firstName: String = "Eko"
    var lastName: String = "Khannedy"
    var fullName: String = "Eko Kurniawan Khannedy"
    var address: String = """
        Street Not Yet Done,
        Province Subang,
        Country Indonesia
    """

    println(firstName)
    println(lastName)
    println(fullName)
    println(address)

    var address1: String = """
        |Street Not Yet Done,
        |Province Subang
    """.trimMargin() //Default dari method ini menggunakan character pipe |
    var address2: String = """
        >Street Not Yet Done,
        >Province Subang
    """.trimMargin(">")

    println(address1)
    println(address2)

//    var fullName2:String = firstName + " " + lastName cara ini tidak direkomendasikan
    var fullName2: String = "$firstName $lastName"
    println(fullName2)

    var desc: String = "Total $fullName2 char = ${fullName2.length}"
    println(desc)

}