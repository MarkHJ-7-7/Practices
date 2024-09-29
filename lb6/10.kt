fun main() {
    val mas = arrayOf(1,8,3,2,4,17,14,26)
    var sum = 0

    println("\n" + mas.joinToString())

    for(bss in 0..mas.size - 1){
        if(mas[bss] % 2 == 0){
            sum += mas[bss]
        }

    }
    println("\nСумма чётных чисел - ${sum}")


}