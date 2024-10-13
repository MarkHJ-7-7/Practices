fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
fun main() {
    val a = 4
    val s = 7
    println("$a четное: ${isEven(a)}")
    println("$s четное: ${isEven(s)}")
}