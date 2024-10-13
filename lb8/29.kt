fun findMinMax(f: IntArray): Pair<Int, Int> {
    if (f.isEmpty()) {
        throw IllegalArgumentException("Массив пуст")
    }
    var min = f[0]
    var max = f[0]
    for (b in f) {
        if (b < min) {
            min = b
        }
        if (b > max) {
            max = b
        }
    }
    return Pair(min, max)
}
fun main() {
    val a = intArrayOf(5, 2, 8, 1, 9, 3, 7)
    val (min, max) = findMinMax(a)
    println("Минимальное значение: $min")
    println("Максимальное значение: $max")
}