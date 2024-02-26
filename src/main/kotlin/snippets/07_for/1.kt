package f_07_for.s_1

fun main() {
    val list = listOf("A", "B", "C")
    for (letter in list) {
        print(letter)
    }

    // Variable type can be explicit
    for (str: String in setOf("D", "E", "F")) {
        print(str)
    }
}
// ABCDEF
