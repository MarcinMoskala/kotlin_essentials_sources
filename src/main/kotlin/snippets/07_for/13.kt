package f_07_for.s_13

fun main() {
    val names = listOf("Alex", "Bob", "Celina")

    names.forEachIndexed { i, name ->
        println("[$i] $name")
    }
}
