package f_21_generics.s_3

import kotlin.random.Random

fun <T> id(value: T): T = value

fun <T> randomOf(a: T, b: T): T =
    if (Random.nextBoolean()) a else b

fun main() {
    val a = id(10) // Inferred a type is Int
    val b = id("AAA") // Inferred b type is String
    val c = randomOf("A", "B") // Inferred c type is String
    val d = randomOf(1, 1.5) // Inferred d type is Number
}
