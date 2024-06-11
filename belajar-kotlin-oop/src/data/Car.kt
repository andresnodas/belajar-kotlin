package data

class Car(
    //Constructor
    paramBrand: String,
    paramName: String,
    paramYear: Int,
) {

    // Initializer Block -> For Main Constructor
    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String): this(paramBrand, paramName, 2020) {
        println("Secondary Constructor 1")
    }

    constructor(paramBrand: String): this(paramBrand, "") {
        println("Secondary Constructor 2")
    }

    constructor(paramBrand: String, paramYear: Int): this(paramBrand, "", paramYear) {
        println("Secondary Constructor 3")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}