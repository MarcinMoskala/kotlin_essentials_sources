package f_18_collections.s_19

fun main() {
    val letters = listOf("A", "B", "C")
    println("A" !in letters) // false
    println("Z" !in letters) // true
}
