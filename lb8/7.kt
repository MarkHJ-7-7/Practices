fun isDivisibleBy100(number: Int): Boolean {
    return number % 100 == 0
}
fun main() {
    val number1 = 200
    val number2 = 150
    val result1 = isDivisibleBy100(number1)
    val result2 = isDivisibleBy100(number2)
    println("$number1 делится на 100: $result1")
    println("$number2 делится на 100: $result2")
}