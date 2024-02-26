package f_18_collections.s_41

fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    for (entry in map) {
        println("${entry.key} is for ${entry.value}")
    }
}
// A is for Alex
// B is for Bob
