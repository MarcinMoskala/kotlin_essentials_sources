package f_06_functions.s_15

fun cheer(how: String = "Hello,", who: String = "World") {
    print("$how $who")
}

fun main() {
    cheer(who = "Group") // Hello, Group
}
