fun main() {
    println("Введите строку:")
    val a = readLine() ?: ""
    val d = a.map { char ->
        if (char.isLowerCase()) {
            char.uppercase()
        } else if (char.isUpperCase()) {
            char.lowercase()
        } else {
            char
        }
    }.joinToString("")

    println("Измененная строка: $d")
}