package f_09_classes.s_19

class User(
    var name: String = "",
    var surname: String = "Anonim",
)

fun main() {
    val user = User("Johnny")
    println(user.name) // Johnny
    println(user.surname) // Anonim
}
