fun isSumLessThan100(num1: Int, num2: Int): Boolean {
    return num1 + num2 < 100
}
fun main() {
    val a = 50
    val b = 40
    val c = isSumLessThan100(a, b)
    println("Сумма меньше 100: $c")
}