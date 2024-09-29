fun main(){
    val matrix = arrayOf(
        arrayOf(1, 1, 1),
        arrayOf(2, 2, 2),
        arrayOf(3, 3, 3)
    )

    val transposed = Array(matrix[0].size) { IntArray(matrix.size) }
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            transposed[j][i] = matrix[i][j]
        }
    }
    println("Транспонированная матрица:")
    for (row in transposed) {
        println(row.joinToString(" "))
    }
}