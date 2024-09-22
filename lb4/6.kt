fun main() {

    println("Угадайте чило 0 или 1")

    val balls = (0..1).random()
    val g = readln().toInt()

    when(g){
        balls -> println("Красава")
        else -> println("Не судьба")
    }
}