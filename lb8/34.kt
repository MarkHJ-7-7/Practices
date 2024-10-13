fun removeSpaces(input: String): String {
    return input.replace(" ", "")
}
fun main() {
    val a = "  Привет, как дела?  "
    val b = removeSpaces(a)
    println("Исходная строка: '$a'")
    println("Строка без пробелов: '$b'")
}