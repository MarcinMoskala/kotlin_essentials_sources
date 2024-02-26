package f_21_generics.s_6

class Box<T> {
    var value: T? = null

    fun getOrThrow(): T = value!!
}
