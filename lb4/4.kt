fun main() {
    println("введите время")
    val grade = readln().toInt()

    when(grade){
        0,1,2,3,4,5-> println("ночь")
        6,7,8,9,10,11 -> println("утро")
        12,13,14,15,16,17,18 -> println("день")
        19,20,21,22,23 -> println("вечер")
        else -> println("не то время")
    }
}