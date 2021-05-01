/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Selection%20Sort
 */

fun main() {
    val mainArray = mutableListOf(8, 5, 2, 9, 5, 6, 3)
    print(selectionSort(mainArray))
}

fun selectionSort(array: MutableList<Int>): List<Int> {
    var startId = 0
    while (startId < array.size - 1) {
        var smallestIdx = startId
        for (i in startId + 1 until array.size) {
            if (array[smallestIdx] > array[i]) {
                smallestIdx = i
            }
        }
        val temp = array[startId]
        array[startId] = array[smallestIdx]
        array[smallestIdx] = temp
        startId++

    }
    return array
}