import kotlin.random.Random
fun main() {
    println("Угадай число от одного до ста")
    var randNum = (Random.nextInt(1, 100))
    println("Число загадал, введи свой вариант:")
    var polzNum = readln().toInt()
    while (polzNum != 0) {
        if (polzNum == randNum) {
            println("Вы угадали!")
            break
        } else if (polzNum > randNum) {
            println("Моё число меньше, попробуй ещё раз")
            polzNum = readln().toInt()
        } else if (polzNum < randNum) {
            println("Моё число больше, попробуй ещё раз")
            polzNum = readln().toInt()
        }


    }
}