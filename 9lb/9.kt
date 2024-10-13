fun main() {
    println("Введите длинну пароля")
    println(pass(readln().toInt()))
}
fun pass(length: Int): String {
    val charset = ('A'..'Z') + ('a'..'z') + ('0'..'9') + ('!'..'/')
    return (1..length)
        .map { charset.random() }
        .joinToString("")
}