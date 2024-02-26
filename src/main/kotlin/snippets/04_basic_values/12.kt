package f_04_basic_values.s_12

fun main() {
    var i = 1
    println(i) // 1
    i += 10
    println(i) // 11
    i -= 5
    println(i) // 6
    i *= 3
    println(i) // 18
    i /= 2
    println(i) // 9
    i %= 4
    println(i) // 1

    // Post-incrementation
    // increments value and returns the previous value
    println(i++) // 1
    println(i) // 2

    // Pre-incrementation
    // increments value and returns the new value
    println(++i) // 3
    println(i) // 3

    // Post-decrementation
    // decrements value and returns the previous value
    println(i--) // 3
    println(i) // 2

    // Pre-decrementation
    // decrements value and returns the new value
    println(--i) // 1
    println(i) // 1
}
