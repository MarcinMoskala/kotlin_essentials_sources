package f_07_for.s_10

fun main() {
    val names = listOf("Alex", "Bob", "Celina")

    for (i in 0..<names.size) {
        val name = names[i]
        println("[$i] $name")
    }
}
