package f_18_collections.s_46

fun main() {
    val arr1 = arrayOf("A", "B", "C")
    val arr2 = arrayOf("A", "B", "C")
    println(arr1 == arr2) // false
    println(arr1) // [Ljava.lang.String;@4f023edb
    println(arr2) // [Ljava.lang.String;@3a71f4dd
}
