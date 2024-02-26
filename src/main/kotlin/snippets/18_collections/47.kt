package f_18_collections.s_47

fun main() {
    val arr1: Array<String> = arrayOf("A", "B", "C")
    val list: List<String> = arr1.toList()
    val arr2: Array<String> = list.toTypedArray()
    val set: Set<String> = arr2.toSet()
    val arr3: Array<String> = set.toTypedArray()
}
