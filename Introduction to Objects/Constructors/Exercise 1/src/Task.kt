// Constructors/Task1.kt
package constructorsExercise1

class Floating (val d: Double) {
  override fun toString(): String {
    return "$d"
  }
}

fun main() {
  var f = Floating(1.0)
}