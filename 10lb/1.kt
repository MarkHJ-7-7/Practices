fun printNumber(n: Int): List<Int> {
    if (n == 0) {
        return emptyList()
    }
    val a = mutableListOf<Int>()
    for (i in n downTo 1) {
        a.add(i)
    }
    return a
}
fun main() {
    println(printNumber(0))
    println(printNumber(2))
    println(printNumber(5))
}