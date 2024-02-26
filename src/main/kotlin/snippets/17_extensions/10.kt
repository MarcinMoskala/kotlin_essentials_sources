package f_17_extensions.s_10

object A

fun A.foo() {}

fun main() {
    A.foo()

    val a: A = A
    a.foo()
}
