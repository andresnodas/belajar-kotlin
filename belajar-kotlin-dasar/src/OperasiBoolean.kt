fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiExtra = 70

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiExtra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
    println(apakahLulus)

}