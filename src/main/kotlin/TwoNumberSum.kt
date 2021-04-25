/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Two%20Number%20Sum
 */

fun main() {
    val list = mutableListOf(3, 5, -4, 8, 11, 1, -1, 6)
    print(twoNumberSum(list, 10).joinToString(separator = ","))
}

fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
    // Write your code here.
    val list = mutableListOf<Int>()
    for (i in array.indices) {
        for (j in (i + 1)..array.size) {
            if (targetSum - array[i] == array[j]) {
                list.add(array[i])
                list.add(array[j])
            }
        }
    }
    return list.distinct()
}