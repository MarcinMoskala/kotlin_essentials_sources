package f_21_generics.s_15

inline fun <K, reified V> Map<K, *>
        .filterValueIsInstance(): Map<K, V> =
    filter { it.value is V } as Map<K, V>

fun main() {
    val props = mapOf(
        "name" to "Alex",
        "age" to 25,
        "city" to "New York"
    )
    // One type argument inferred with _, one specified
    val strProps = props.filterValueIsInstance<_, String>()
    println(strProps) // {name=Alex, city=New York}
}
