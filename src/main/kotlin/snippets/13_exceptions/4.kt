package f_13_exceptions.s_4

fun main() {
    val a = try {
        1
    } catch (e: Error) {
        2
    }
    println(a) // 1

    val b = try {
        throw Error()
        1
    } catch (e: Error) {
        2
    }
    println(b) // 2
}
