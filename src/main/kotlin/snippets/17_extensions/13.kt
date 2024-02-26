package f_17_extensions.s_13

interface Iterable<out T> {
    operator fun iterator(): Iterator<T>
}
