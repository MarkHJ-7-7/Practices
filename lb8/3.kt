fun mergeLists(list1: List<Int>, list2: List<Int>): List<Int> {
    val a = mutableListOf<Int>()
    a.addAll(list1)
    a.addAll(list2)
    return a
}
fun main() {
    val b = listOf(1, 2, 3)
    val c = listOf(4, 5, 6)
    val d = mergeLists(b, c)
    println("Объединенный список: $d")
}