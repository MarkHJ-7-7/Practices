fun main() {
    var mas = intArrayOf(1,2,7,6,2,17,34,19)
    var a = 0
    println(mas.joinToString())
    println("Среднеарифметическое" + int(mas,a))
}

fun int(mas:IntArray,a:Int):Int{
    var a = 0
    for(bss in 0..mas.size-1){
        a += mas[bss]
    }
    return a/mas.size
}