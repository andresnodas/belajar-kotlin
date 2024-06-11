import java.util.Arrays

fun main() {

    val members: Array<String> = arrayOf("Eko", "Joko", "Budi")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    println(members)
    println(values)
    println(balances)

    //Lebih direkomendasikan menggunakan indexing operator
    println(members[0])
    println(members.get(1))

    println(values.size)

    // Kita bisa mengubah isi arraynya walaupun variablenya menggunakan val
    // Yang kita tidak bisa rubah adalah isi variablenya misal mengganti dengan array lain
    balances[1] = 25_000
    balances.set(1, 25_000)
    println(balances[1])

    val names: Array<String?> = arrayOfNulls(5)
    names.set(0, "Eko")
    names[1] = null
    names[2] = "Kurniawan"
    names[3] = null
    names[4] = "Khannedy"
//    Panjang dari array itu tidak dinamis
//    Akan throw ArrayIndexOutOfBoundsException
//    names[5] = "Test"

    println(names.contentToString())

}