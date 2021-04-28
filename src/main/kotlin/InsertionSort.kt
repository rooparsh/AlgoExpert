/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Insertion%20Sort
 */

fun main() {
    val mainArray = mutableListOf(8, 5, 2, 9, 5, 6, 3)
    print(insertionSort(mainArray))
}

fun insertionSort(array: MutableList<Int>): List<Int> {
    if (array.isEmpty()) return array
    for (i in 0 until array.size) {
        var j = i
        while (j > 0 && array[j - 1] > array[j]) {
            array[j - 1] = array[j - 1] - array[j]
            array[j] = array[j - 1] + array[j]
            array[j - 1] = array[j] - array[j - 1]
            j--
        }
    }
    return array
}