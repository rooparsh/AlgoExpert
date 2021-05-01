/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Move%20Element%20To%20End
 */

fun main() {
    // 1 4 5 4 2 2 2 1
    print(moveElementToEnd(mutableListOf(2, 1, 2, 2, 2, 3, 4, 2), 2))
}

fun moveElementToEnd(array: MutableList<Int>, toMove: Int): List<Int> {
    // Write your code here.
    var startIdx = 0
    var endIdx = array.size - 1

    while (startIdx < endIdx) {
        while (startIdx < endIdx && array[endIdx] == toMove) endIdx--
        if (array[startIdx] == toMove) {
            val temp = array[startIdx]
            array[startIdx] = array[endIdx]
            array[endIdx] = temp
        }
        startIdx++
    }
    return array
}