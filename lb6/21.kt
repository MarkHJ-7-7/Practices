fun main() {

    var mass = arrayListOf(1,2,3,4,5)
    println(mass.joinToString())
    println("выберите число для удаления")
    var n = readln().toInt()
    mass.remove(n)
    println(mass.joinToString())
}