fun sumArray(numbers: IntArray): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}
fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    val sum = sumArray(a)
    println("Сумма элементов массива: $sum")
}