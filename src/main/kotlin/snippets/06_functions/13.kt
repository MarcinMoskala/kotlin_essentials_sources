package f_06_functions.s_13

fun cheer(how: String = "Hello,", who: String = "World") {
    println("$how $who")
}

fun main() {
    cheer() // Hello, World
    cheer("Hi") // Hi World
}
