package f_19_operators.s_10

inline operator fun <K, V>
Map<out K, V>.iterator(): Iterator<Map.Entry<K, V>> =
    entries.iterator()

fun main() {
    val map = mapOf('a' to "Alex", 'b' to "Bob")
    for ((letter, name) in map) {
        println("$letter like in $name")
    }
}
