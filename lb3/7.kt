fun main() {
    println("Введите число A")
    val a = readln().toDouble()

    println("Введите число B")
    val b = readln().toDouble()

    println("${Math.max(a,b)} - большее\n" +
            "${Math.min(a,b)} меньшее")
}