// Summary1/Task9.kt
package summaryIExercise9

import lazyinitialization.idle

fun printTriangle(n: Int) {
  var space: Int = n - 1
  var hash: Int = 1
  for (id in 1..n) {
    var line: String = ""
    space = n - id
    hash = 2 * id - 1

    for (i in 1..space) {
      line += " "
    }
    for (i in 1..hash) {
      line += "#"
    }
//    for (i in 1..space) {
//      line += " "
//    }
    println(line)
  }

}

fun main() {
  printTriangle(2)
}
/* Output:
   #
  ###
 #####
#######
*/