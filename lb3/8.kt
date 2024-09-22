fun main(){
    var kms = readln().toDouble(); var foot = readln().toDouble()
    if(kms < (foot * 0.000305)) println("$kms - меньшее")
    else if((foot * 0.000305) < kms) println("$foot - меньшее")
}