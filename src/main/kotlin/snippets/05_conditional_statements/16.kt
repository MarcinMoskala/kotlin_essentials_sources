package f_05_conditional_statements.s_16

fun convertToInt(num: Number): Int =
    if (num is Int) num  // the type of num here is Int
    else num.toInt()
