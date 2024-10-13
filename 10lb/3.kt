fun main(){
    println("Введите Английское слово которое нужно зашифровать")
    var str = readln()
    println(cezar(str))
}
fun cezar(str:String):String{
    var propusc = 3
    return str.map { char ->
        when {char.isUpperCase() -> ('A' + (char - 'A' + propusc) % 26)
            char.isLowerCase() -> ('a' + (char - 'a' + propusc) % 26)
            else -> char }
    }.joinToString("")
}