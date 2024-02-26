package f_07_for.s_8

fun main() {
    for (i in 1..10 step 3) {
        print("$i ")
    }
    println()
    for (i in 1..<10 step 3) {
        print("$i ")
    }
    println()
    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }
}
// 1 4 7 10 
// 1 4 7 
// 10 7 4 1 
