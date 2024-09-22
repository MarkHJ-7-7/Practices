fun main() {
    var a = readln().toInt()
    var i = a
    while (i != 0) {
        a = a - (a % 10)
        i--


    }
    a /= 10

    println( "в числе $a десятков")
}