fun main() {
    val mas = arrayOf(1,4,7,3,2,12,27,19)
    var g = IntArray(0)
    var c = IntArray(0)

    for(bss in 0..mas.size - 1){
        if(mas[bss] % 2 == 0){
            g += mas[bss]
        }
        else{
            c += mas[bss]
        }
    }


    println("\n${g.joinToString()} - Чётные\n")
    println("\n${c.joinToString()} - Нечётные\n")
}