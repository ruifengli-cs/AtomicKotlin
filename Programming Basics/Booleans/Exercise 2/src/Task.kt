// Booleans/Task2.kt
package booleansExercise2

fun showAnd(first: Boolean, second: Boolean) {
  val res: Boolean = first && second
  println("$first && $second == $res")
}

fun showOr(first: Boolean, second: Boolean) {
  val res: Boolean = first || second
  println("$first || $second == $res")
}

fun showTruthTable() {
  showAnd(true, true)
  showAnd(true, false)
  showAnd(false, true)
  showAnd(false, false)

  showOr(true, true)
  showOr(true, false)
  showOr(false, true)
  showOr(false, false)

}

fun main() {
  showTruthTable()
}