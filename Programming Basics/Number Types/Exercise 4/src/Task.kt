// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
  seconds * 1000L + minutes * 60L * 1000 + hours * 60L * 60 * 1000
//  ((hours * 60L + minutes) * 60L) * 1000L

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}