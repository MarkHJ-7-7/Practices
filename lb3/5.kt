fun main() {
    println("Введите сторону 1")
    val st1 = readln().toInt()

    println("Введите сторону 2")
    val st2 = readln().toInt()

    println("Введите сторону 3")
    val st3 = readln().toInt()

    if((st1 + st2 > st3) && (st1 + st3 > st2) && (st3 + st2 > st1)){
        println("Треугольник существует")
    }
    else{
        print("Треугольника НЕ существует")
    }
}