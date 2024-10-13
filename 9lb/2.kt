fun main(){
    println("введите строку: ")
    val inputString = readLine()!!.lowercase()

    var vowelCount = 0
    var d = 0
    for(char in inputString) {
        if (char.isLetter()) {

            vowelCount++
        } else {
            d++
        }
    }
    println("кол-во глас: $vowelCount")
    println("кол-во согл: $d")
}