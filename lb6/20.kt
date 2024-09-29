fun main() {
    val start = 1
    val raznost = 2
    val kolvo_elementov = 10

    val massa = IntArray(kolvo_elementov) { start + it * raznost }
    println("Массив с арифмет. прогрессией: ${massa.joinToString(", ")}")
}