package data

//Secara default dia akan menjadi open
abstract class Location(val name: String)

class City(name: String) : Location(name)

class Country(name: String) : Location(name)