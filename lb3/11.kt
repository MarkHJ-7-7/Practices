fun main() {
    val b = readln().toDouble()

    if(b % 2 == 0.0){
        println("$b - Четное\n")
    }
    else{
        println("$b - НЕчетное\n")
    }
    if((b % 10 == 7.0) || (b.toInt() == 7))
        print("Число $b на 7")
}