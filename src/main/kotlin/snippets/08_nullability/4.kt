package f_08_nullability.s_4

fun main() {
    println("A" ?: "B") // A
    println(null ?: "B") // B
    println("A" ?: null) // A
    println(null ?: null) // null
}
