package f_06_functions.s_9

fun concatenate(vararg strings: String): String {
    // The type of `strings` is Array<String>
    var accumulator = ""
    for (s in strings) accumulator += s
    return accumulator
}

fun sum(vararg ints: Int): Int {
    // The type of `ints` is IntArray
    var accumulator = 0
    for (i in ints) accumulator += i
    return accumulator
}

fun main() {
    println(concatenate()) //
    println(concatenate("A", "B")) // AB
    println(sum()) // 0
    println(sum(1, 2, 3)) // 6
}
