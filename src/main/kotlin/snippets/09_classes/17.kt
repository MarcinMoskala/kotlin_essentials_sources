package f_09_classes.s_17

class User(name: String, surname: String) {
    var name: String = name
    var surname: String = surname

    // Secondary constructor
    constructor(user: User) : this(user.name, user.surname) {
        // optional body
    }
}

fun main() {
    val user = User("Johnny", "Depp")
    println(user.name) // Johnny
    println(user.surname) // Depp

    val user2 = User(user)
    println(user2.name) // Johnny
    println(user2.surname) // Depp
}
