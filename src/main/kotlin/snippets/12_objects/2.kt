package f_12_objects.s_2

class Robot {
    // Possible, but rarely useful
    // prefer regular member properties instead
    private val point = object {
        var x = 0
        var y = 0
    }

    fun moveUp() {
        point.y += 10
    }

    fun show() {
        println("(${point.x}, ${point.y})")
    }
}

fun main() {
    val robot = Robot()
    robot.show() // (0, 0)
    robot.moveUp()
    robot.show() // (0, 10)

    val point = object {
        var x = 0
        var y = 0
    }
    println(point.x) // 0
    point.y = 10
    println(point.y) // 10
}
