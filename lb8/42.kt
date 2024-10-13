fun findFirstIndex(array: IntArray, element: Int): Int {
    for (i in array.indices) {
        if (array[i] == element) {
            return i
        }
    }
    return -1
}
fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5, 3, 6)
    val b = 3
    val c = findFirstIndex(a, b)
    println("Индекс первого вхождения $b: $c")
}