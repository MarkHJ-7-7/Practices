fun repeatString(txt: String, n: Int): String {
    if (n == 1) {
        return txt
    } else {
        return txt + repeatString(txt, n - 1)
    }
}
fun main() {
    val a = "hi"
    val b = 3
    val c = repeatString(a, b)
    println("$c")
}