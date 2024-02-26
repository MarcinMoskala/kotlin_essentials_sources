package f_21_generics.s_2

import kotlin.random.Random

// The result type is the same as the argument type
fun <T> id(value: T): T = value

// The result type is the closest supertype of arguments
fun <T> randomOf(a: T, b: T): T =
    if (Random.nextBoolean()) a else b

fun main() {
    val a = id(10) // Inferred a type is Int
    val b = id("AAA") // Inferred b type is String
    val c = randomOf("A", "B") // Inferred c type is String
    val d = randomOf(1, 1.5) // Inferred d type is Number
}
