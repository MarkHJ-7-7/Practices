fun countChars(text: String): Int {
    return text.length
}

fun main() {
    println("Введите строку:")
    val a = readLine()!!
    val b = countChars(a)
    println("Количество символов в строке: $b")
}