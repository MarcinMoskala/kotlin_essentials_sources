package f_21_generics.s_12

open class C<T>
interface I<T>
class A<T> : C<Int>(), I<String>

fun main() {
    val a1: A<Double> = A<Double>()
    val c1: C<Int> = a1
    val i1: I<String> = a1
}
