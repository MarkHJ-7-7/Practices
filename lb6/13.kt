fun main() {
    var massiv = IntArray(0)
    var rnd = (1..100).random()

    for(bss in 0..20){
        rnd = (1..100).random()
        massiv += rnd
    }

    println("\n" + massiv.joinToString())
}