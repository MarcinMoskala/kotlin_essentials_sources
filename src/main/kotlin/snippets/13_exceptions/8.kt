package f_13_exceptions.s_8

fun makeOperation(
    operation: String,
    left: Int,
    right: Int? = null
): Int = when (operation) {
    "add" ->
        left + (right ?: error("Two numbers required"))
    "subtract" ->
        left - (right ?: error("Two numbers required"))
    "opposite" -> -left
    else -> error("Unknown operation")
}

fun main() {
    println(makeOperation("add", 1, 2)) // 3
    println(makeOperation("subtract", 1, 2)) // -1
    println(makeOperation("opposite", 10)) // -10

    makeOperation("add", 1) // ERROR!
    // IllegalStateException: Two numbers required
    makeOperation("subtract", 1) // ERROR!
    // IllegalStateException: Two numbers required
    makeOperation("other", 1, 2) // ERROR!
    // IllegalStateException: Unknown operation
}
