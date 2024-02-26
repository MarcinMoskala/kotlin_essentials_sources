package f_21_generics.s_9

open class C<T>
interface I<T>
class A : C<Int>(), I<String>

fun main() {
    val a = A()
    val c: C<Int> = a
    val i: I<String> = a
}
