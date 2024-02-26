package f_18_collections.s_49

fun main() {
    val doubles: DoubleArray = doubleArrayOf(2.71, 3.14, 9.8)
    val chars: CharArray = charArrayOf('X', 'Y', 'Z')

    val accepts: List<Boolean> = listOf(true, false, true)
    val acceptsArr: BooleanArray = accepts.toBooleanArray()

    val ints: Set<Int> = setOf(2, 4, 8, 10)
    val intsArr: IntArray = ints.toIntArray()
}
