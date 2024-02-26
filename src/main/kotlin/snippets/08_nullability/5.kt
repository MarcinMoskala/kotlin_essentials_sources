package f_08_nullability.s_5

class User(val name: String)

fun printName(user: User?) {
    val name: String = user?.name ?: "default"
    println(name)
}

fun main() {
    printName(User("Cookie")) // Cookie
    printName(null) // default
}
