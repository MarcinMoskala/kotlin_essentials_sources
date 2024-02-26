package f_19_operators.s_5

fun main() {
    val letters = setOf("A", "B", "C")
    println("A" in letters) // true
    println("D" in letters) // false
    println(letters.contains("A")) // true
    println(letters.contains("D")) // false
}
