// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonWhitespace(s: String) {
  var idx = 0
  for (c in s) {
    if (c == ' ') {
      continue
    }
    idx++
    if (idx % 5 == 0){
      println(c)
    }
  }
}

fun main() {
  everyFifthNonWhitespace("abc d e fgh ik")
}
/* Output:
e
k
*/