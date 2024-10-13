fun sumFromOneToN(N: Int): Int {
    return (1..N).sum()
}
fun main() {
    val a = 10
    val b = sumFromOneToN(a)
    println("Сумма чисел от 1 до $a: $b")
}