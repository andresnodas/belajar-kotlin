fun main() {

    var i = 0

    while (true) {
        println("Break me")
        i++
        if (i > 1000) {
            break
        }
    }

    for (j in 1..1000) {
        if (j % 2 == 0) {
            continue
        }
        println("Angka $j")
    }

}