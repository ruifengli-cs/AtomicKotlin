// IfExpressions/Task3.kt
package ifExpressionsExercise3

fun findMax(first: Int, second: Int): Int {
  if (second > first)
    return second
  return first
}


fun main() {
  println(findMax(-1, 4))  // 4
}