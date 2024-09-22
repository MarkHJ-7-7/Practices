fun main() {

    val i = readln().toInt()

    var f1 = 0
    var f2 = 1

    print(" Числа до $i : ")

    for (i in 1..i ) {
        print("$f1 ")


        val sum = f1 + f2
        f1 = f2
        f2 = sum
    }
}