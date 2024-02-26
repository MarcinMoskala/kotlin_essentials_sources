package f_09_classes.s_5

class User {
    // DON'T DO THAT
    var name: String = ""
        // Using property name inside getter
        // leads to infinitive recursion
        get() = name.uppercase()
}

fun main() {
    val user = User()
    user.name = "norbert"
    println(user.name) // Error: java.lang.StackOverflowError
}
