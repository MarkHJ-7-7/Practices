fun main() {
    val a = readln().toInt()
    for (bss in 1..a) {
        println()
        if (bss < 10) {
            for (bs in 1..bss) {
                print(bss)

            }
        }
        if (bss == 10){
            for(g in 1..5)
                print(10)
        }
    }
}
