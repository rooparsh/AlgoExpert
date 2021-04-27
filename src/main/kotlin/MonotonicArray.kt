/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Monotonic%20Array
 */

fun main() {
    val array = listOf<Int>(2, 2, 2, 1, 4, 5)
    print(isMonotonic(array))
}

fun isMonotonic(array: List<Int>): Boolean {
    var isIncreasing = true
    var isDecreasing = true

    if (array.size >= 2) {
        if (array[0] < array[1]) {
            isIncreasing = true
            isDecreasing = false
        } else if (array[0] > array[1]) {
            isDecreasing = true
            isIncreasing = false
        }

        for (i in 2 until array.size) {
            if ((array[i] > array[i + 1]) && isIncreasing) {
                isIncreasing = false
                break
            } else if ((array[i] < array[i + 1]) && isDecreasing) {
                isDecreasing = false
                break
            }
        }
    }

    return isIncreasing or isDecreasing
}