package f_17_extensions.s_3

fun String.remove(value: String) = this.replace(value, "")

fun main() {
    println("Who Framed Roger Rabbit?".remove(" "))
    // WhoFramedRogerRabbit?
}
