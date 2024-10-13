fun sumOfNaturalNumbers(n: Int): Int {
    return if (n <= 0) {
        0
    } else {
        n * (n + 1) / 2
    }
}
fun main() {
    val n = 10
    val sum = sumOfNaturalNumbers(n)
    println("Сумма первых $n натуральных чисел: $sum")
}