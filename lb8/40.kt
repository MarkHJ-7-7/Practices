fun copyArray(numbers: IntArray): IntArray {
    return numbers.copyOf()
}
fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    val b = copyArray(a)
    b[0] = 10
    println("Оригинальный массив: ${a.joinToString(", ")}")
    println("Скопированный массив: ${b.joinToString(", ")}")
}