package f_20_type_system.s_3

inline fun TODO(): Nothing = throw NotImplementedError()

inline fun error(message: Any): Nothing =
    throw IllegalStateException(message.toString())
