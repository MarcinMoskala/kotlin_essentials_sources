package f_07_for.s_2

fun main() {
    val tree = Tree(
        value = "B",
        left = Tree("A"),
        right = Tree("D", left = Tree("C"))
    )

    for (value in tree) {
        print(value) // ABCD
    }
}

class Tree(
    val value: String,
    val left: Tree? = null,
    val right: Tree? = null,
) : Iterable<String> {

    override fun iterator(): Iterator<String> = iterator {
        if (left != null) yieldAll(left)
        yield(value)
        if (right != null) yieldAll(right)
    }
}
