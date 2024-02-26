package f_18_collections.s_34

fun main() {
    val capitals: Map<String, String> = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
    )
    println(capitals) // {USA=Washington DC, Poland=Warsaw}

    val alphabet: Map<Char, Int> =
        mapOf('A' to 1, 'B' to 2, 'C' to 3)
    println(alphabet) // {A=1, B=2, C=3}
}
