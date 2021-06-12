// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var res: String = ""
  for (ch in 'a'..'z') {
    res += ch
  }
  return res
}

fun main() {

  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}