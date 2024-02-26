package f_08_nullability.s_3

class User(val name: String) {
    fun cheer() {
        println("Hello, my name is $name")
    }
}

var user: User? = User("Cookie")

fun main() {
    println(user!!.name.length) // 6
    user = null
    println(user!!.name.length) // throws NullPointerException
}
