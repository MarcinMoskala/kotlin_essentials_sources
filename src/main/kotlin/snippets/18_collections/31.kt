package f_18_collections.s_31

fun main() {
    val letters = setOf('A', 'B', 'C')
    println(letters.contains('A')) // true
    println(letters.contains('Z')) // false
    println('A' in letters) // true
    println('Z' in letters) // false
}
