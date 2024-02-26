package f_09_classes.s_6

class User {
    var name: String = ""
        get() = field.uppercase()
    // or
    // var name: String = ""
    //     get() {
    //         return field.uppercase()
    //     }
}

fun main() {
    val user = User()
    user.name = "norbert"
    println(user.name) // NORBERT
}
