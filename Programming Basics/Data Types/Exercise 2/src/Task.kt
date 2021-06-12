// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val v1 = int + int
  val v2 = int + double
//  val v3 = int + boolean
//  val v4 = int + string
//  val v5 = int + character

  val v11 = double + int
  val v12 = double + double
//  val v13 = double + boolean
//  val v14 = double + string
//  val v15 = double + character

//  val v21 = boolean + int
//  val v22 = boolean + double
//  val v23 = boolean + boolean
//  val v24 = boolean + string
//  val v25 = boolean + character

  val v31 = string + int
  val v32 = string + double
  val v33 = string + boolean
  val v34 = string + string
  val v35 = string + character

  val v41 = character + int
//  val v42 = character + double
//  val v43 = character + boolean
  val v44 = character + string
//  val v45 = character + character

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
  val v111 = int + int

  println("The type that can't be combined " +
    "with itself using '+':")
  println("Boolean")
}