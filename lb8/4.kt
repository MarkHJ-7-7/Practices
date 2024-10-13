fun isWorthIt(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}
fun main() {
    val a = 0.5
    val b = 100.0 
    val c = 50.0
    val isWorthIt = isWorthIt(a, b, c)
    println("Стоит ли играть? $isWorthIt")
}