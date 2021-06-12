// RepetitionWithWhile/WhileLoop.kt

fun condition(i: Int): Boolean = i < 100  // [1]

fun main() {
  var i = 0
  while (condition(i)) {         // [2]
    print(".")
    i += 10                      // [3]
  }
}
/* Output:
..........
*/