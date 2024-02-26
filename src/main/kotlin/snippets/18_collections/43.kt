package f_18_collections.s_43

fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    for ((letter, name) in map) {
        println("$letter is for $name")
    }
}
// A is for Alex
// B is for Bob
