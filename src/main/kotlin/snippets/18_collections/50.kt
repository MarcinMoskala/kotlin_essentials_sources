package f_18_collections.s_50

fun markdownList(vararg lines: String): String {
    // the type of lines is Array<String>
    var str = ""
    for ((i, line) in lines.withIndex()) {
        str += " * $line"
        if (i != lines.size) {
            str += "\n"
        }
    }
    return str
}

fun main() {
    print(markdownList("A", "B", "C"))
    // * A
    // * B
    // * C
}
