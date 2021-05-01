/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Caesar%20Cipher%20Encryptor
 */

fun main() {
    val redShirtHeights = mutableListOf(126)    // 10  8  5  4  3
    val blueShirtHeights = mutableListOf(126)   // 10  6  5  4  2
    val output = classPhotos(redShirtHeights, blueShirtHeights)
    print(output)
}

fun classPhotos(redShirtHeights: MutableList<Int>, blueShirtHeights: MutableList<Int>): Boolean {
    redShirtHeights.sortDescending()
    blueShirtHeights.sortDescending()


    val isBluesSecondRow = redShirtHeights[0] < blueShirtHeights[0]
    blueShirtHeights.zip(redShirtHeights) { blue, red ->
        if (isBluesSecondRow && blue <= red) return false
        else if (isBluesSecondRow.not() && red <= blue) return false
    }
    return true
}
