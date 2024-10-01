fun main(){
    println("Количество побед: ")
    var wins = readln().toIntOrNull()
    println("Количество ничьих: ")
    var nichi = readln().toIntOrNull()
    println("Количество поражений: ")
    var loses = readln().toIntOrNull()
    if((wins == null)||(loses == null)||(nichi == null)){
        println("Введите нормальные значения")
        return
    }
    var wins2 = (wins*2)+nichi
    println(" Количество очков - $wins2")



}