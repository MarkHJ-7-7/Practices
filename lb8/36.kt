fun containsSubstring(text: String, substring: String): Boolean {
    return text.contains(substring)
}
fun main() {
    println("Введите текст:")
    val a = readLine()!!
    println("Введите подстроку:")
    val b = readLine()!!
    if (containsSubstring(a, b)) {
        println("Подстрока '$b' содержится в тексте '$a'")
    } else {
        println("Подстрока '$b' не содержится в тексте '$a'")
    }
}