fun sumList(list: List<Int>): Int {
    var sum = 0
    for (a in list) {
        sum += a
    }
    return sum
}
fun main() {
    val v = listOf(1, 2, 3, 4, 5)
    val sum = sumList(v)
    println("Сумма элементов списка: $sum")
}