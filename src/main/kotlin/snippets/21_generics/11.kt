package f_21_generics.s_11

interface Iterable<out T> {
    // ...
}
interface MutableIterable<out T> : Iterable<T> {
    // ...
}
interface Collection<out E> : Iterable<E> {
    /// ...
}
interface MutableCollection<E> : Collection<E>,MutableIterable<E>{
    // ...
}
interface List<out E> : Collection<E> {
    // ...
}
interface MutableList<E> : List<E>, MutableCollection<E> {
    // ...
}
