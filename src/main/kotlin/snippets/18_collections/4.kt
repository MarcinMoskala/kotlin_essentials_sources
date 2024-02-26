package f_18_collections.s_4

fun main() {
    // We create `List` using `listOf` function.
    val list: List<String> = listOf("A", "B", "C")
    // We create `MutableList` using `mutableListOf` function.
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)

    // We create `Set` using `setOf` function.
    val set: Set<Double> = setOf(3.14, 7.11)
    // We create `MutableSet` using `mutableSetOf` function.
    val mutableSet: MutableSet<Char> = mutableSetOf('A', 'B')

    // We create `Map` using `mapOf` function.
    val map: Map<Char, String> =
        mapOf('A' to "Alex", 'B' to "Ben")
    // We create `MutableMap` using `mutableMapOf` function.
    val mutableMap: MutableMap<Int, Char> =
        mutableMapOf(1 to 'A', 2 to 'B')

    // We create `Array` using `arrayOf` function.
    val array: Array<String> = arrayOf("Dukaj", "Sapkowski")
    // We create `IntArray` using `intArrayOf` function.
    val intArray: IntArray = intArrayOf(9, 8, 7)

    // We create `ArrayList` using `arrayListOf` function.
    val arrayList: ArrayList<String> = arrayListOf("M", "N")
}
