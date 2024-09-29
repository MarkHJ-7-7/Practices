fun main() {
    print("Введите элементы массива через пробел: ")
    val mass = readLine()!!.split(" ").map { it.toInt() }
    println(mass.joinToString(", "))
}