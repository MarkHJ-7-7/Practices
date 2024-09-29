fun main() {
    var mass = arrayListOf(1,2,3,4,5)
    var mass2 = arrayListOf(6,7,8,9,10)
    var mass3 = IntArray(mass.size)
    for(balls in 0..mass.size-1){
        mass3[balls]+=mass[balls] + mass2[balls]
    }
    println(mass3.joinToString())
}
