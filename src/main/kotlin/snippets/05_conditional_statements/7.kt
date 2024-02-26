package f_05_conditional_statements.s_7

fun main() {
    println("Is it going to rain?")
    val probability = 70
    when {
        probability < 40 -> println("Na-ha")
        probability <= 80 -> println("Likely")
        probability < 100 -> println("Yes")
        else -> println("Holly Crab")
    }
}
