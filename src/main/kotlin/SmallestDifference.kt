import kotlin.math.abs

/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Smallest%20Difference
 */

fun main() {
    val arrayOne = mutableListOf(-1, 5, 10, 20, 28, 3)
    val arrayTwo = mutableListOf(26, 134, 135, 15, 17)
    print(smallestDifference(arrayOne, arrayTwo))
}

fun smallestDifference(arrayOne: MutableList<Int>, arrayTwo: MutableList<Int>): List<Int> {
    var smallestDifference = Int.MAX_VALUE
    var smallestItemsList = listOf<Int>()
    arrayOne.forEach { first ->
        arrayTwo.forEach { second ->
            val diff = abs(first - second)
            if (diff < smallestDifference) {
                smallestDifference = diff
                smallestItemsList = listOf(first, second)
            }
        }
    }
    return smallestItemsList
}
