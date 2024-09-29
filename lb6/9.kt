fun main() {
    var mass = arrayOf(1, 2, 5, 4, 3, 6, 3, 14, 52, 42)
    var mass2 = mutableListOf<Int>()
    for(i in 0..mass.size - 1){
        mass2.add(mass[i])
    }
    println(mass2.joinToString())

}