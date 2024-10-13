fun main() {
    println("Введите предел проверки")
    var n = readln().toInt()
    for(bss in 0..n){
        println("$bss ="+ isPrime(bss))
    }
}
fun isPrime(num: Int): Boolean {
    if (num < 2) {
        return false
    }
    val sqrt = Math.sqrt(num.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}