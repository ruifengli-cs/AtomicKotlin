// Properties/Task3.kt
package propertiesExercise3

class Robot {
  var x = 0
  var y = 0
  val boundry = 100

  fun right(steps: Int) {
    x += steps
    if (x >= boundry)
      x = x % boundry
  }

  fun left(steps: Int) {
    x -= steps
    x = x % boundry
    if (x < 0) {
      x = boundry + x
    }

  }

  fun down(steps: Int) {
    y += steps
    if (y >= boundry)
      y = y % boundry
  }

  fun up(steps: Int) {
    y -= steps
    y = y % boundry
    if (y < 0) {
      y = boundry + y
    }
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
//  robot.up(1)
//  println(robot.getLocation())
  robot.left(130)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/