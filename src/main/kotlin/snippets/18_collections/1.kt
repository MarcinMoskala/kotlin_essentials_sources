package f_18_collections.s_1

interface Iterable<out T> {
    operator fun iterator(): Iterator<T>
}
