// LoopingAndRanges/Task3.kt
package loopingAndRangesExercise3

fun sumOfEven(n: Int): Int {
  if (n < 2){
    return 0
  }
  var res = 0
  for (i in 2..n step 2){
    res += i
  }
  return res
}

fun main() {
  println(sumOfEven(10))  // 30
}