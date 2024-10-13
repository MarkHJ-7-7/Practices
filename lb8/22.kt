fun isPalindrome(text: String): Boolean {
    val cleanText = text.lowercase().replace("[^a-zA-Z0-9]".toRegex(), "")
    return cleanText == cleanText.reversed()
}

fun main() {
    println("Введите строку:")
    val a = readLine()!!
    if (isPalindrome(a)) {
        println("$a - это палиндром")
    } else {
        println("$a - это не палиндром")
    }
}