// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(s: String) {
    val n: Int = s.length
    var i = 0
    while (i < n){
        println(s[i++])
    }

}

fun main() {
  displayContent("abc")
}
/* Expected output:
a
b
c
*/