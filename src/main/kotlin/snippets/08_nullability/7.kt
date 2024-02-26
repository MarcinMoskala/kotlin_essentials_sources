package f_08_nullability.s_7

fun check(list: List<Int>?) {
    println("The list: \"$list\"")
    println("The list or empty: \"${list.orEmpty()}\"")
    println("Is it null or empty? " + list.isNullOrEmpty())
}

fun main() {
    check(listOf(1, 2, 3))
    // The list: "[1, 2, 3]"
    // The list or empty: "[1, 2, 3]"
    // Is it null or empty? false
    check(null)
    // The list: "null"
    // The list or empty: "[]"
    // Is it null or empty? true
    check(listOf())
    // The list: "[]"
    // The list or empty: "[]"
    // Is it null or empty? true
}
