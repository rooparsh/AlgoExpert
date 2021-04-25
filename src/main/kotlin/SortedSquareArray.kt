import kotlin.math.sqrt

/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Sorted%20Squared%20Array
 */

fun main() {
    val mainArray = listOf(5, 1, 22, 25, 6, -1, 8, 10)
    sortedSquaredArray(mainArray)
}

fun sortedSquaredArray(array: List<Int>): List<Int> = array.map { it -> it * it }.sorted()