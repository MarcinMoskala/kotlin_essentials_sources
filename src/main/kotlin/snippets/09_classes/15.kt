package f_09_classes.s_15

class User(
    var name: String,
    var surname: String,
) {
    // optional body
}

fun main() {
    val user = User("Johnny", "Depp")
    println(user.name) // Johnny
    println(user.surname) // Depp
}
