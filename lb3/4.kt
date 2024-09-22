fun main() {
    var a = readln().toInt();
    var b = readln().toInt()
    if (a % b == 0) print("числа кратные")
    else print("остаток от деления = ${a % b}")
}