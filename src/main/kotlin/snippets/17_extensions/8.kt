package f_17_extensions.s_8

object A

fun A.foo() {}

fun main() {
    A.foo()

    val a: A = A
    a.foo()
}
