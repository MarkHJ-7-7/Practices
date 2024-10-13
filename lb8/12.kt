fun OpenAIWithOs(number: Int): String {
    return "G" + "o".repeat(number) + "gle"
}
fun main() {
    val a = 3
    val c = OpenAIWithOs(a)
    println(c)
}