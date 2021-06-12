// IfExpressions/Task1.kt
package ifExpressionsExercise1

fun checkSign(number: Int): String {
  if (number < 0)
    return "negative"
  else if (number == 0)
    return "zero"
  else
    return "positive"

}

fun main() {
  println(checkSign(-19))  // negative
}