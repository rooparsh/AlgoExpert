/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/First%20Duplicate%20Value
 */

fun main() {
    val input = mutableListOf(2, 1, 5, 2, 3, 3, 4)
    val output = firstDuplicateValue(input)
    print(output)
}

fun firstDuplicateValue(array: MutableList<Int>): Int {
    val duplicateArray = mutableListOf<Int>()
    array.forEach { item ->
        if (duplicateArray.contains(item)) {
            return item
        } else {
            duplicateArray.add(item)
        }
    }
    return -1
}
