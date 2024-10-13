fun <T> getElementByIndex(array: Array<T>, index: Int): T? {
    return if (index in array.indices) {
        array[index]
    } else {
        null
    }
}
fun main() {
    val a = arrayOf(10, 20, 30, 40, 50)
    val b = 2
    val c = getElementByIndex(a, b)
    if (c != null) {
        println("Элемент на индексе $b: $c")
    } else {
        println("Индекс $b вне диапазона массива.")
    }
}