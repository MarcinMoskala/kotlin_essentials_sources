package f_06_functions.s_14

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.joinToString("-")) // 1-2-3-4
    // better
    println(list.joinToString(separator = "-")) //  1-2-3-4
}
