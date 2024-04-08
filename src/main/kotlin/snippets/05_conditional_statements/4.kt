package f_05_conditional_statements.s_4

fun Any?.print() {
    print(this)
}

fun printNumberSign(num: Int) {
    if (num < 0) {
        "negative"
    } else if (num > 0) {
        "positive"
    } else {
        "zero"
    }.print()
}

fun main(args: Array<String>) {
    printNumberSign(-2)
    print(",")
    printNumberSign(0)
    print(",")
    printNumberSign(2)
}
