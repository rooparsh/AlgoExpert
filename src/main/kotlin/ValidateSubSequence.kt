/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Validate%20Subsequence
 */

fun main() {
    val mainArray = listOf(5, 1, 22, 25, 6, -1, 8, 10)
    val sequence = listOf(1, 6, -1, 10)
    print("Answer is ${isValidSubsequence(mainArray, sequence)}")
}

fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    var sequenceCounter = 0
    for (i in array.indices) {
        if (sequenceCounter == sequence.size) break
        if (array[i] == sequence[sequenceCounter]) sequenceCounter++
    }
    return sequence.size == sequenceCounter
}