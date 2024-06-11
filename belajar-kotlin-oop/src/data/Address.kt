package data

class Address {
    //Tidak bisa langsung di set oleh parameter secondary constructor
    //Hanya bisa dilakukan oleh primary constructor
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // Secondary Constructor without Primary Constructor
    constructor(paramStreet: String, paramCity: String) {
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String)
            // Calling another Secondary Constructor
            : this(paramStreet, paramCity) {
        country = paramCountry
    }
}