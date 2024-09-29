fun main() {
    var mas1 = arrayOf(15, 2, 5, 3, 2, 17, 24, 5)
    var mas2 = arrayOf(5, 2, 3, 6, 11, 17,6, 1)
    println("\nПервый массив " + mas1.joinToString())
    println("\nВторой массив " + mas2.joinToString())
    mas1.sort()
    println("\nПервый массив sort " + mas1.joinToString())
    mas2.sort()
    println("\nВторой массив sort " + mas2.joinToString())
    var mas3 = mas1 + mas2
    mas3.sort()
    println("\nСлияние " + mas3.joinToString())
}