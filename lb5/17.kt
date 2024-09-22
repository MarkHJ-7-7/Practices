fun main() {
    println("Введите число для вывода по строкам")
    var b = readln()
    var g = 0
    var p = 0
    var c = b.toCharArray()
    while(p<=b.length-1){
        println(c[p])
        p++
    }
}