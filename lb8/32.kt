fun reverseString(input: String): String {
    return input.reversed()
}
fun main() {
    val a = "Hello, World!"
    val b = reverseString(a)
    println("Original: $a")
    println("Reversed: $b")
}