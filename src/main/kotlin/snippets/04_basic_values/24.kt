package f_04_basic_values.s_24

fun main() {
    val text1 = "Let\'s say:\n\"Hooray\""
    println(text1)
    // Let's say:
    // "Hooray"
    val text2 = """Let\'s say:\n\"Hooray\""""
    println(text2)
    // Let\'s say:\n\"Hooray\"
    val text3 = """Let's say:
"Hooray""""
    println(text3)
    // Let's say:
    // "Hooray"
}
