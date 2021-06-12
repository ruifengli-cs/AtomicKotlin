// InKeyword/Task4.kt
package theInKeywordExercise4

import sun.font.TrueTypeFont

// isValidCharacter

fun isValidIdentifier(s: String): Boolean {
  if (s.isEmpty() || (s[0] !in 'a'..'z' && s[0] !in 'A'..'Z') && s[0] != '_') {
    return false
  }
  for (ch in s) {
   if (ch !in 'a'..'z' && ch !in 'A'..'Z' && ch !in '0'..'9' && ch != '_') {
     return false
   }
  }
  return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}