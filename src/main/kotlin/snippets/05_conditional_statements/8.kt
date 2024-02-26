package f_05_conditional_statements.s_8

fun main() {
    println("Is it going to rain?")
    val probability = 70
    val text = when {
        probability < 40 -> "Na-ha"
        probability <= 80 -> "Likely"
        probability < 100 -> "Yes"
        else -> "Holly Crab"
    }
    println(text)
}
