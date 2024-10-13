fun createArray(n: Int): IntArray {
    return IntArray(n) { it + 1 }
}
fun main() {
    val n = 5
    val a = createArray(n)
    println("Массив от 1 до $n: ${a.joinToString(", ")}")
}