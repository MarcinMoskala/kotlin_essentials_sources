package f_09_classes.s_10

class User(
    var name: String,
    var surname: String,
) {
    val fullName1: String
        get() = "$name $surname"
    val fullName2: String = "$name $surname"
}

fun main() {
    val user = User("Maja", "Markiewicz")
    println(user.fullName1) // Maja Markiewicz
    println(user.fullName2) // Maja Markiewicz
    user.surname = "Moskała"
    println(user.fullName1) // Maja Moskała
    println(user.fullName2) // Maja Markiewicz
}
