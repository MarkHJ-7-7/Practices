fun main() {
    var d = readln().toDouble()

    println("$d доллар = ${println(torub(d))} рублей")
}
fun torub(d:Double):Double{

    return d * 97
}