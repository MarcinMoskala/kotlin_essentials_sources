package f_18_collections.s_5

fun main() {
    val list: List<Char> = listOf('A', 'B', 'C')
    val mutableList: MutableList<Char> = list.toMutableList()
    val set: Set<Char> = mutableList.toSet()
    val mutableSet: MutableList<Char> = set.toMutableList()
    val array: Array<Char> = mutableSet.toTypedArray()
    val charArray: CharArray = array.toCharArray()
    val list2: List<Char> = charArray.toList()
}
