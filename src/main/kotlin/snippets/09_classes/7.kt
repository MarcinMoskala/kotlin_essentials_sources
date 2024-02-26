package f_09_classes.s_7

class User {
    var name: String = ""
    var surname: String = ""
    val fullName: String
        get() = "$name $surname"
}

fun main() {
    val user = User()
    user.name = "Maja"
    user.surname = "Moskała"
    println(user.fullName) // Maja Moskała
}
