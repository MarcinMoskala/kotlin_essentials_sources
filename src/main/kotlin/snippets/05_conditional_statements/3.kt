package f_05_conditional_statements.s_3

fun main() {
    println("Is it going to rain?")
    val probability = 70
    if (probability < 40) {
        println("Na-ha")
    } else if (probability <= 80) {
        println("Likely")
    } else if (probability < 100) {
        println("Yes")
    } else {
        println("Holly Crab")
    }
}
