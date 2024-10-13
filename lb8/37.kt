fun printMultiplicationTable(number: Int) {
    println("Таблица умножения для $number:")
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
}
fun main() {
    println("Введите число:")
    val number = readLine()!!.toInt()
    printMultiplicationTable(number)
}