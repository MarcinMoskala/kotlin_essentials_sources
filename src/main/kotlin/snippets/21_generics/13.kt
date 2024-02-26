package f_21_generics.s_13

import kotlin.reflect.typeOf

inline fun <reified T> example(a: Any) {
    val check = a is T
    val ref = T::class
    val type = typeOf<T>()
}
