// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  if (n == 0) {
    return 1
  }
  var res: Long = 1
  for (i in 1..n){
    res *= i
  }
  return res
}

fun main() {
  println(factorial(10))  // 3628800
}