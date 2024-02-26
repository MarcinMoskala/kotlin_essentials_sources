package f_17_extensions.s_4

fun String.remove(value: String) = this.replace(value, "")

fun main() {
    println("A B C".remove(" ")) // ABC
}
