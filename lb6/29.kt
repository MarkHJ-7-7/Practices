fun main() {
    var mass = arrayOf(1,2,7,6,2,17,34,19)
    println("${mass.joinToString(", ")}")
    val sortedArray = mass.sortedArray()
    val n = sortedArray.size
    if (n % 2 == 0) {
        (sortedArray[n / 2 - 1] + sortedArray[n / 2]) / 2.0
    } else {
        sortedArray[n / 2].toDouble()
    }
}