package f_08_nullability.s_2

class User(val name: String) {
    fun cheer() {
        println("Hello, my name is $name")
    }
}

var user: User? = null

fun main() {
    // println(user?.name.length) // ILLEGAL
    println(user?.name?.length) // null
    user = User("Cookie")
    // println(user?.name.length) // ILLEGAL
    println(user?.name?.length) // 6
}
