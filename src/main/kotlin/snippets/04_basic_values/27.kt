package f_04_basic_values.s_27

fun main() {
    val text1 = """ABC\nDEF"""
    println(text1) // ABC\nDEF
    val text2 = """ABC${"\n"}DEF"""
    println(text2)
    // ABC
    // DEF
}
