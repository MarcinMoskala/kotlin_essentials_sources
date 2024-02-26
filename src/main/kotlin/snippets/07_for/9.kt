package f_07_for.s_9

fun main() {
    for (i in 1..5) {
        if (i == 3) break
        print(i)
    }
    // 12

    println()

    for (i in 1..5) {
        if (i == 3) continue
        print(i)
    }
    // 1245
}
