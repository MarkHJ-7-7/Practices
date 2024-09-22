fun main() {
    println("Введите число:")
    val n = readLine()!!.toInt()
    var s = 0.0
    for (i in 1..n) {
        s += 1.0 / i
    }
    println("Сумма = $n: $s")
}