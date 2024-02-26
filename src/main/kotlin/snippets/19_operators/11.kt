package f_19_operators.s_11

public interface Comparable<in T> {
    /**
     * Compares this object with the specified object for
     * order. Returns zero if this object is equal to the
     * specified [other] object, a negative number if it's
     * less than [other], or a positive number if it's
     * greater than [other].
     */
    public operator fun compareTo(other: T): Int
}
