fun getLastElement(array: IntArray): Int {
    if (array.isEmpty()) {
        throw IllegalArgumentException("Массив пуст")
    }
    return array[array.size - 1]
}
fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    val b = getLastElement(a)
    println("Последний элемент массива: $b")
}