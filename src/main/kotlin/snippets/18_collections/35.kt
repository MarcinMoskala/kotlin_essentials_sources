package f_18_collections.s_35

fun main() {
    val alphabet: Map<Char, Int> =
        mapOf('A' to 1, 'B' to 2, 'C' to 3)
    val number: Int? = alphabet['A']
    println(number) // 1
    println(alphabet['B']) // 2
    println(alphabet['&']) // null
}
