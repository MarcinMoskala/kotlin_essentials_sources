package f_18_collections.s_14

fun main() {
    val map = mutableMapOf("A" to 1, "B" to 2)
    println(map.getOrPut("A") { 3 }) // 1
    println(map.getOrPut("C") { 3 }) // 3
    println(map) // {A=1, B=2, C=3}
}
