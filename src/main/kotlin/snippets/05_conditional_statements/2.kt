package f_05_conditional_statements.s_2

fun main() {
    var isOne = true
    val number1: Int = if (isOne) 1 else 0
    println(number1) // 1
    isOne = false
    val number2: Int = if (isOne) 1 else 0
    println(number2) // 0

    val superuser = true
    val hasAccess: Boolean = if (superuser) {
        println("Good morning, sir Admin")
        true
    } else {
        false
    }
    println(hasAccess) // true
}
