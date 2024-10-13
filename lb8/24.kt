fun toUpperCase(text: String): String {
    return text.uppercase()
}

fun main() {
    println("Введите строку:")
    val a = readLine()!!
    val b = toUpperCase(a)
    println("Текст в верхнем регистре: $b")
}