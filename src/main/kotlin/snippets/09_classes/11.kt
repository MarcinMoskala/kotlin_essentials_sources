package f_09_classes.s_11

class User {
    var name: String = ""
    var surname: String = ""

    constructor(name: String, surname: String) {
        this.name = name
        this.surname = surname
    }
}

fun main() {
    val user = User("Johnny", "Depp")
    println(user.name) // Johnny
    println(user.surname) // Depp
}
