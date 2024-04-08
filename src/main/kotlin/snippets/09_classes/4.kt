package f_09_classes.s_4

class User {
    var name: String = ""
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "Alex" // setter call
    println(user.name) // getter call
}
