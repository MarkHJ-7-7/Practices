fun main() {
    var mas1 = arrayOf(1, 2, 5, 6, 3, 17, 21, 19)
    var mas2 = arrayOf(5, 2, 4, 3, 4, 17, 21, 19)

    println(mas1.joinToString())
    println(mas2.joinToString())

    println("Введите индекс для замены")
    val g = readln().toInt()
    val c = mas1[g]
    mas1[g] = mas2[g]
    mas2[g] = c

    println(mas1.joinToString())
    println(mas2.joinToString())


}