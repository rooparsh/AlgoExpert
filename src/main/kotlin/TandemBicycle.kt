import kotlin.math.max

/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Tandem%20Bicycle
 */

fun main() {
    val redShirtSpeeds = mutableListOf<Int>()
    val blueShirtSpeeds = mutableListOf<Int>()
    val fastest = true
    print(tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest))
}

fun tandemBicycle(redShirtSpeeds: MutableList<Int>, blueShirtSpeeds: MutableList<Int>, fastest: Boolean): Int {
    if (redShirtSpeeds.isEmpty() || blueShirtSpeeds.isEmpty()) {
        return 0
    }
    redShirtSpeeds.sort()    //2 3 5 5 9
    if (fastest) {
        blueShirtSpeeds.sortDescending() // 7 6 3 2 1
    } else {
        blueShirtSpeeds.sort()
    }
    return redShirtSpeeds.zip(blueShirtSpeeds) { red, blue -> max(red, blue) }.reduce { acc, i -> acc + i }
}

