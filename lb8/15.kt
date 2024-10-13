fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
fun main() {
    val a = 5
    val b = 10
    val c = max(a, b)
    println("Больше число: $c")
}