package f_18_collections.s_40

fun main() {
    val map = mapOf('A' to "Alex", 'B' to "Bob")
    println('A' in map) // true
    println(map.containsKey('A')) // true
    println('Z' in map) // false
    println(map.containsKey('Z')) // false
}
