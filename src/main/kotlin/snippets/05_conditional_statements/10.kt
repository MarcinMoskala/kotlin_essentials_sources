package f_05_conditional_statements.s_10

private val magicNumbers = listOf(7, 13)

fun describe(a: Any?): String = when (a) {
    null -> "Nothing"
    1, 2, 3 -> "Small number"
    in magicNumbers -> "Magic number"
    in 4..100 -> "Big number"
    is String -> "This is just $a"
    is Long, is Int -> "This is Int or Long"
    else -> "No idea, really"
}

fun main() {
    println(describe(null)) // Nothing
    println(describe(1)) // Small number
    println(describe(3)) // Small number
    println(describe(7)) // Magic number
    println(describe(9)) // Big number,
    // because 9 is in range from 4 to 100
    println(describe("AAA")) // This is just AAA
    println(describe(1L)) // This is Int or Long
    println(describe(-1)) // This is Int or Long
    println(describe(1.0)) // No idea, really,
    // because 1.0 is Double
}
