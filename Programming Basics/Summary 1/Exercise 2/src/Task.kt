// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var new_str: String = ""
  for (idx in 0 until s.length step 2) {
    new_str += s[idx]
  }
  return new_str
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/