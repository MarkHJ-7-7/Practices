fun main(){
    var mass = arrayOf(1, 2, 7, 4, 1, 5, 3,14, "wow", 17)
    for (i in 0..9){
        when(mass[i]){
            is String -> println(mass[i])
        }
    }


}