package f_15_sealed.s_6

sealed interface Parent
class A : Parent
class B : Parent
class C : Parent

fun main() {
    println(Parent::class.sealedSubclasses)
    // [class A, class B, class C]
}
