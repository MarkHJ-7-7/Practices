fun combineStrings(str1: String, str2: String): String {
    return "$str1$str2"
}

fun main() {
    println("Введите первую строку:")
    val a = readLine()!!
    println("Введите вторую строку:")
    val b = readLine()!!
    val c = combineStrings(a, b)
    println("Объединенная строка: $c")
}