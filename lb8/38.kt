fun stringLength(text: String): Int {
    return text.length
}
fun main() {
    println("Введите строку:")
    val a = readLine()!!
    val b = stringLength(a)
    println("Длина строки: $b")
}