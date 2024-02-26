package f_18_collections.s_45

fun main() {
    val arr: Array<String> = arrayOf("A", "B", "C")
    println(arr[0]) // A
    println(arr.get(0)) // A
    println(arr[1]) // B
    arr[1] = "D"
    println(arr[1]) // D
    arr.set(2, "E")
    println(arr[2]) // E
    println(arr.size) // 3
    for (e in arr) {
        print(e)
    }
    // ADE
}
