package data

class User(
    //Hanya bisa dilakukan di primary constructor
    var username: String,
    var password: String,
) {

    override fun toString(): String {
        return "User with username=${this.username}"
    }

}