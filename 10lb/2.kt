fun main() {
    println("Введите кол-во строк #")
    var n = readln().toInt()
    generate(n)
    println()

}
fun generate(n:Int){
    var s = 1
    for(bss in 1..n){
        println()
        for(bs in 1..s)
            print(" # ")
        s += 2
    }
}