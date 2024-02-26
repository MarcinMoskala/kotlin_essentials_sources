package f_07_for.s_13

fun main() {
    val names = listOf("Alex", "Bob", "Celina")

    names.forEachIndexed { i, name ->
        println("[$i] $name")
    }
}
// [0] Alex
// [1] Bob
// [2] Celina
