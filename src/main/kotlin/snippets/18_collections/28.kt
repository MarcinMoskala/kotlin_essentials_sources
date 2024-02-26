package f_18_collections.s_28

fun main() {
    val names = listOf("Jake", "John", "Jake", "James", "Jan")
    println(names) // [Jake, John, Jake, James, Jan]
    val unique = names.toSet()
    println(unique) // [Jake, John, James, Jan]
}
