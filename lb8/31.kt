fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9/5) + 32
}
fun main() {
    val a = 25.0
    val b = celsiusToFahrenheit(a)
    println("$a °C = $b °F")
}