fun countVowels(text: String): Int {
    val g = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0
    for (v in text) {
        if (v in g) {
            count++
        }
    }
    return count
}
fun main() {
    println("Введите строку:")
    val a = readLine()!!
    val b = countVowels(a)
    println("Количество гласных: $b")
}