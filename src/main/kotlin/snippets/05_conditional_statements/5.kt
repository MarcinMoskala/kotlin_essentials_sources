package f_05_conditional_statements.s_5

// Function we can execute on any object, to print it
// 10.print() prints 10
// "ABC".print() prints ABC
fun Any?.print() {
    print(this)
}

fun printNumberSign(num: Int) {
    when {
        num < 0 -> "negative"
        num > 0 -> "positive"
        else -> "zero"
    }.print()
}

fun main(args: Array<String>) {
    printNumberSign(-2) // negative
    print(",") // ,
    printNumberSign(0) // zero
    print(",") // ,
    printNumberSign(2) // positive
}
