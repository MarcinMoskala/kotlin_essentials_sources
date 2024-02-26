package f_13_exceptions.s_5

import java.io.File
import java.io.FileNotFoundException

fun main() {
    val content = try {
        File("AAA").readText()
    } catch (e: FileNotFoundException) {
        ""
    }
    println(content) // (empty string)
}
