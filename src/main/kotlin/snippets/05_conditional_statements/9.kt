package f_05_conditional_statements.s_9

private val magicNumbers = listOf(7, 13)

fun describe(a: Any?) {
    when (a) {
        null -> println("Nothing")
        1, 2, 3 -> println("Small number")
        in magicNumbers -> println("Magic number")
        in 4..100 -> println("Big number")
        is String -> println("This is just $a")
        is Long, is Int -> println("This is Int or Long")
        else -> println("No idea, really")
    }
}

fun main() {
    describe(null) // Nothing
    describe(1) // Small number
    describe(3) // Small number
    describe(7) // Magic number
    describe(9) // Big number,
    // because 9 is in range from 4 to 100
    describe("AAA") // This is just AAA
    describe(1L) // This is Int or Long
    describe(-1) // This is Int or Long
    describe(1.0) // No idea, really,
    // because 1.0 is Double
}
