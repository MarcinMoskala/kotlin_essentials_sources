package f_07_for.s_12

fun main() {
    val names = listOf("Alex", "Bob", "Celina")

    for ((i, name) in names.withIndex()) {
        println("[$i] $name")
    }
}
// [0] Alex
// [1] Bob
// [2] Celina
