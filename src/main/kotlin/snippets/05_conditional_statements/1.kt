package f_05_conditional_statements.s_1

fun main() {
    val i = 1 // or 5
    if (i < 3) { // i < 3 is used as a condition
        // will be executed when condition returns true
        println("Smaller")
    } else {
        // will be executed when condition returns false
        println("Bigger")
    }
    // Prints Smaller if i == 1, or Bigger if i == 5
}
