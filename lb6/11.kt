fun main(){
    var mass = arrayOf(1, 2, 5, 4, 9, 7, 3,11, 65, 32)
    var mass1 = arrayOf(4,19,43,11,2,1)
    val intersectionSet = mass.toSet().intersect(mass1.toSet())
    println(intersectionSet.joinToString())
}