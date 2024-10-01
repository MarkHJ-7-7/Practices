fun trueOfFalse(a:Int, b:Int):Boolean{
    return when{
        a == b -> true
        else -> false
    }
}
fun main(){
    print("Введите первое число: ")
    var a = readln().toInt()
    print("Введите второе число: ")
    var b = readln().toInt()
    println("\n${trueOfFalse(a, b)}")
}