package f_12_objects.s_3

class Box {
    var value: Any? = NOT_SET

    fun initialized() = value != NOT_SET

    companion object {
        private val NOT_SET = object {}
    }
}

private val LOCK = object {}
fun synchronizedOperation() = synchronized(LOCK) {
    // ...
}
