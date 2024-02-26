package f_07_for.s_11

fun main() {
    val names = listOf("Alex", "Bob", "Celina")

    for (i in names.indices) {
        val name = names[i]
        println("[$i] $name")
    }
}
// [0] Alex
// [1] Bob
// [2] Celina
