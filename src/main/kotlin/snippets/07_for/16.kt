package f_07_for.s_16

fun main() {
    val capitals = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
        "Ukraine" to "Kiev"
    )

    capitals.forEach { (country, capital) ->
        println("The capital of $country is $capital")
    }
}
