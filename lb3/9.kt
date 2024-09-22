fun main() {
    var m = readln().toInt();
    var n = readln().toInt()
    if (m % n == 0) print("${m / n} - частное")
    else print("нацело не делится")
}