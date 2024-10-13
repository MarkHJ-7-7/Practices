fun factorial(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}

fun main() {
    println("Введите число:")
    val a = readLine()!!.toInt()
    val s = factorial(a)
    println("Факториал $a равен $s")
}