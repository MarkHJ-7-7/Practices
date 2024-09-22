fun main() {

    println("Введите начало")
    var a = readln().toInt()

    println("Введите шаг")
    var b = readln().toInt()

    println("Введите конец")
    var c = readln().toInt()

    while(a < c){
        println(a)
        a += b
    }
}