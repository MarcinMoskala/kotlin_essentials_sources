package f_18_collections.s_51

fun <T> listOf(vararg elements: T): List<T> =
    if (elements.size > 0) elements.asList() else emptyList()

fun <T> setOf(vararg elements: T): Set<T> =
    if (elements.size > 0) elements.toSet() else emptySet()
