fun reverseArray(numbers: IntArray): IntArray {
    val f = numbers.copyOf()
    for (i in 0 until numbers.size / 2) {
        val g = f[i]
        f[i] = f[numbers.size - 1 - i]
        f[numbers.size - 1 - i] = g
    }
    return f
}
fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    val b = reverseArray(a)
    println("Перевернутый массив: ${b.joinToString(", ")}")
}