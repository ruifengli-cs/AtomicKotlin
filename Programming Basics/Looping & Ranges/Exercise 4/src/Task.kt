// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun printHalfPyramid(n: Int) {
  var s = "#"
  repeat (n){
    println(s)
    s += "#"
  }
}

fun main() {
  printHalfPyramid(4)
}
/* Output:
#
##
###
####
*/