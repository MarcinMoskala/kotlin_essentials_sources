package f_21_generics.s_10

open class C<T>
interface I<T>
class A<T> : C<T>(), I<T>

fun main() {
    val a: A<Int> = A<Int>()
    val c1: C<Int> = a
    val i1: I<Int> = a

    val a1: A<String> = A<String>()
    val c2: C<String> = a1
    val i2: I<String> = a1
}
