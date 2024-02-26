package f_08_nullability.s_1

class User(val name: String) {
    fun cheer() {
        println("Hello, my name is $name")
    }
}

var user: User? = null

fun main() {
    user?.cheer() // (does nothing)
    println(user?.name) // null
    user = User("Cookie")
    user?.cheer() // Hello, my name is Cookie
    println(user?.name) // Cookie
}
