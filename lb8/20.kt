fun findMax(numbers: IntArray): Int {
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("тютю массив :0")
    }
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}
fun main() {
    val a = intArrayOf(1, 5, 3, 9, 2)
    val b = findMax(a)
    println("Наибольшее число в массиве: $b")
}