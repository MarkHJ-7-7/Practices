fun main(){
    var mass = arrayOf(3,25, 13, 4, 5, 6, 7,8, 9, 10)
    println("введите число")
    var a = readln().toInt()
    for(i in 0..mass.size - 1){
        if(mass[i] == a){
            println("Инедкс вашего числа $i")
        }

    }
}