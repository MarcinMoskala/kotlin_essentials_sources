package f_18_collections.s_30

fun main() {
    val set = setOf('A', 'B', 'C')
    println(set.size == 0) // false
    println(set.isEmpty()) // false

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // true
    println(empty.isEmpty()) // true
}
