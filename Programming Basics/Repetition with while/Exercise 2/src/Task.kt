// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var res = 0
  var i = 1
  while (i <= number) {
    res += i++
  }
  return res
}

fun main() {
  println(sum(10))  // 55
}