// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  var start: Int = 0
  var end: Int = columns - 1
  var flag: Boolean = true
  val width = (rows * columns).toString().length + 1
  for (i in 1..rows) {
    if (flag)
      for (j in start..end) {
        print("%${width}d".format(j))
      }
    else
      for (j in end downTo start) {
        print("%${width}d".format(j))
      }
    flag = !flag
    start = end + 1
    end = end + columns
    println()
  }
}

fun main() {
  showSnake(2,2)
}
/* Output:
  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/