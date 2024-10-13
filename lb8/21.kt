fun sortArray(arr: IntArray): IntArray {
    return arr.sortedArray()
}
fun main() {
    val a = intArrayOf(5, 3, 8, 1, 2)
    val b = sortArray(a)
    println("Отсортированный массив: ${b.joinToString(", ")}")
}