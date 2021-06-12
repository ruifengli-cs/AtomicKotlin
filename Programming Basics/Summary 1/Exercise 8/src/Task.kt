// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var number = number
  var res: Int = 0
  while (number > 0) {
    res *= 10
    res += (number % 10)
    number /= 10
  }
  return res
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}