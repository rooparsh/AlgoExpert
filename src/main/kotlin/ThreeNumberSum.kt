/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Three%20Number%20Sum
 */

fun main() {
    val list = mutableListOf(12, 3, 1, 2, -6, 5, -8, 6)
    print(threeNumberSum(list, 0).joinToString(separator = ","))
}

fun threeNumberSum(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
    array.sort()
    val list = mutableListOf<MutableList<Int>>()

    for (i in 0..array.size - 2) {
        var left = i + 1
        var right = array.size - 1
        while (left < right) {
            val currentSum = array[i] + array[left] + array[right]
            when {
                currentSum == targetSum -> {
                    list.add(mutableListOf(array[i], array[left], array[right]))
                    left++
                    right--
                }
                targetSum > currentSum -> {
                    left++
                }
                targetSum < currentSum -> {
                    right--
                }
            }
        }

    }
    return list
}
