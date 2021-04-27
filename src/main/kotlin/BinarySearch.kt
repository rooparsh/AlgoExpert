/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Binary%20Search
 */

fun main() {
    val mainArray = listOf(0, 1, 21, 33, 45, 45, 61, 71, 72, 73)
    print(binarySearch(mainArray, 33))
}

fun binarySearch(array: List<Int>, target: Int): Int {
    var startIdx = 0
    var endIdx = array.size - 1
    while (startIdx <= endIdx) {
        val center = (startIdx + endIdx) / 2
        when {
            array[center] == target -> {
                return center
            }
            target < array[center] -> {
                endIdx = center - 1
            }
            target > array[center] -> {
                startIdx = center + 1
            }
        }
    }
    return -1
}