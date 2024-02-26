package f_18_collections.s_17

fun main() {
    val letters = listOf("A", "B", "C")
    println(letters.contains("A")) // true
    println(letters.contains("Z")) // false
    println("A" in letters) // true
    println("Z" in letters) // false
}
