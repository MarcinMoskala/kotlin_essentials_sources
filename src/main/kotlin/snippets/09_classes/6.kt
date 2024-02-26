package f_09_classes.s_6

class User {
    var name: String = ""
        get() = field.uppercase()
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }
}

fun main() {
    val user = User()
    user.name = "norbert"
    user.name = ""
    user.name = "  "
    println(user.name) // NORBERT
}
