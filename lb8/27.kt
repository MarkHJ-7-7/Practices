fun containsElement(array: IntArray, element: Int): Boolean {
    for (number in array) {
        if (number == element) {
            return true
        }
    }
    return false
}
fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    val b = 3
    if (containsElement(a, b)) {
        println("$b присутствует в массиве")
    } else {
        println("$b отсутствует в массиве")
    }
}