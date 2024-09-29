fun main() {
    var mas = arrayOf(1,2,7,6,2,17,34,19)
    var n = readln().toInt()
    var bool = false
    for(balls in 0..mas.size-1){
        if(n == mas[balls]){
            bool = true
            println("$n "+bool)
        }
        else if(n != balls){
            bool = false
            println("$balls $bool")
        }
    }
}