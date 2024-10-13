fun isPowerOfK(n: Int, k: Int): Boolean {
    return Math.pow(k.toDouble(), k.toDouble()).toInt() == n
}
fun main() {
    val n = 27
    val k = 3
    val a = isPowerOfK(n, k)
    println("$k ^ $k == $n: $a")
}