fun differenceMinMax(numbers: List<Int>): Int {
    if (numbers.isEmpty()) {
        return 0
    }
    var min = numbers[0]
    var max = numbers[0]
    for (number in numbers) {
        if (number < min) {
            min = number
        } else if (number > max) {
            max = number
        }
    }
    return max - min
}
fun main() {
    val a = listOf(5, 2, 8, 1, 9, 3, 7)
    val b = differenceMinMax(a)
    println("Разность между максимальным и минимальным значением: $b")
}