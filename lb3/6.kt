fun main() {
    println("Введите год\n")
    val ynum = readln().toDouble()

    if(((ynum % 4) == 0.0) && ((ynum % 100 != 0.0)) || (ynum % 400 == 0.0)){
        println("\nГод ${ynum.toInt()} - високосный")
    }
    else{
        println("\nГод ${ynum.toInt()} - НЕ високосный")
    }
}