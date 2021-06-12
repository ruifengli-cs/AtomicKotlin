// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
  var res = 0
  var i = 0
  while (i <= n) {
    res += i
    i = i + 2
  }
  return res
}

fun main() {
  println(sumOfEven(10))  // 30
}