package app

import data.MyData

fun main() {
    val myData: MyData<String, Int> = MyData<String, Int>("Eko", 10)
    val firstData: String = myData.firstData
    val secondData: Int = myData.secondData
    myData.printlnData()

    val myDataInt: MyData<Int, String> = MyData<Int, String>(10, "Eko")
    val firstDataInt: Int = myDataInt.firstData
    val firstDataString: String = myDataInt.secondData
    myDataInt.printlnData()
}