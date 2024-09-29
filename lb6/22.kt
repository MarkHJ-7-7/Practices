fun main() {
    var mass = arrayListOf(1,2,3,4,5)
    println(mass.joinToString())
    mass.remove(mass.max())
    println(mass.max())
}