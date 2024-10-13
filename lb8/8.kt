fun calculateFrames(minutes: Int, fps: Int): Int {
    return minutes * 70 * fps
}
fun main() {
    val minutes = 5
    val fps = 30
    val frames = calculateFrames(minutes, fps)
    println("За $minutes минут при $fps FPS компьютер покажет $frames кадров.") 
}