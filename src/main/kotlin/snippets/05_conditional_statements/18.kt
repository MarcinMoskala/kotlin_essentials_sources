package f_05_conditional_statements.s_18

fun main() {
    generateSequence(1) { it * 2 }
        .takeWhile { it < 10 }
        .forEach(::print)
    // 1248
}
