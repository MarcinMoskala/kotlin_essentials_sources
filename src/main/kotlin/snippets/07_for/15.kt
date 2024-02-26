package f_07_for.s_15

fun main() {
    val capitals = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
        "Ukraine" to "Kiev"
    )

    for ((country, capital) in capitals) {
        println("The capital of $country is $capital")
    }
}
// The capital of USA is Washington DC
// The capital of Poland is Warsaw
// The capital of Ukraine is Kiev
