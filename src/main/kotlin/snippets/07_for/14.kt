package f_07_for.s_14

fun main() {
    val capitals = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
        "Ukraine" to "Kiev"
    )

    for (entry in capitals.entries) {
        println("The capital of ${entry.key} is ${entry.value}")
    }
}
