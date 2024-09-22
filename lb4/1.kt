fun main() {

    println("Введите номер дня недели")
    val day = readln().toInt()

    when (day) {
        1 -> println("понедельник")
        2 -> println("вторник")
        3 -> println("среда")
        4 -> println("четверг")
        5 -> println("пятница")
        6 -> println("суббота")
        7 -> println("воскресенье")
        else -> {
            println("Неверный номер")
        }
    }
}