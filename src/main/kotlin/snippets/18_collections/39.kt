package f_18_collections.s_39

fun main() {
    val map1 = mapOf('A' to "Alex", 'B' to "Bob")
    val map2 = map1 - 'B'
    println(map1) // {A=Alex, B=Bob}
    println(map2) // {A=Alex}
}
