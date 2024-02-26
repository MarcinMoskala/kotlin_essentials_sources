package f_15_sealed.s_3

fun commentValue(value: String) = when {
    value.isEmpty() -> "Should not be empty"
    value.length < 5 -> "Too short"
    else -> "Correct"
}

fun main() {
    println(commentValue("")) // Should not be empty
    println(commentValue("ABC")) // Too short
    println(commentValue("ABCDEF")) // Correct
}
