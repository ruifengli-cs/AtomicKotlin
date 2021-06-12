// Summary1/Task5.kt
package summaryIExercise5

fun everyFifth(start: Int, end: Int) {
  var idx = 0
  for (i in start..end) {
    idx++
    if (idx % 5 != 0) {
      continue
    }
    println(i)
  }
}

fun main() {
  everyFifth(11, 30)
}
/* Output:
15
20
25
30
*/