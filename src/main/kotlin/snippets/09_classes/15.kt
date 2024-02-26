package f_09_classes.s_15

class User constructor(name: String, surname: String) {
    var name: String = name
    var surname: String = surname
}

fun main() {
    val user = User("Johnny", "Depp")
    println(user.name) // Johnny
    println(user.surname) // Depp
}
