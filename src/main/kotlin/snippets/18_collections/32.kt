package f_18_collections.s_32

fun main() {
    val letters = setOf("A", "B", "C")
    println("A" !in letters) // false
    println("Z" !in letters) // true
}
