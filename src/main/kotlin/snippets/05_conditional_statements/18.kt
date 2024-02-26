package f_05_conditional_statements.s_18

var obj: Any = "AAA"

fun main() {
    if (obj is String) {
        // println(obj.length) will not compile,
        // because `obj` can be modified by some
        // other thread, so Kotlin cannot be sure,
        // that at this point, is it still of type String
    }
}
