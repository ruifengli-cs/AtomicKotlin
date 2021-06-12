// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

import kotlin.reflect.typeOf

fun f(a: Int, b: Int): Int = a + b

fun g(a: String, b: String): String = a + b

fun h() = println("h()")

fun main() {
  val res1: Int = f(1, 2)
  var res2: String = g("ab", "cd")
  var res3: Unit = h()
  println("Int")
  println("String")
  println("Unit")
  }