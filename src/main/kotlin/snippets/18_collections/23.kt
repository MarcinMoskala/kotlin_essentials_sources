package f_18_collections.s_23

fun main() {
    var set = setOf("A", "B")
    set = set + "C"
    println(set) // [A, B, C]
    set = set + setOf("D", "E")
    println(set) // [A, B, C, D, E]
    set = setOf("Z") + set
    println(set) // [Z, A, B, C, D, E]
    set = set - "A"
    println(set) // [Z, B, C, D, E]
}
