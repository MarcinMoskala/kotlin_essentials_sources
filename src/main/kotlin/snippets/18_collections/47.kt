package f_18_collections.s_47

// JVM implementation
operator fun <T> Array<T>.plus(element: T): Array<T> {
    val index = size
    val result = java.util.Arrays.copyOf(this, index + 1)
    result[index] = element
    return result
}

fun main() {
    val arr = arrayOf("A", "B", "C")
    println(arr.size) // 3
    val arr2 = arr + "D"
    println(arr.size) // 3
    println(arr2.size) // 4
}
