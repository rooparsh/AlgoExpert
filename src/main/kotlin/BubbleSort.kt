/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Bubble%20Sort
 */

fun main() {
    val mainArray = mutableListOf(8, 5, 2, 9, 5, 6, 3)
    print(bubbleSort(mainArray))
}

fun bubbleSort(array: MutableList<Int>): List<Int> {
    for (i in 0 until array.size - 1) {
        for (j in i + 1 until array.size) {
            if (array[j] < array[i]) {
                array[i] = array[i] - array[j]
                array[j] = array[i] + array[j]
                array[i] = array[j] - array[i]
            }
        }
    }
    return array
}