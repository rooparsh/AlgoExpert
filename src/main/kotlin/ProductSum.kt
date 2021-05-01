/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Nth%20Fibonacci
 */

fun main() {
    val input = listOf(
        5, 2, listOf(7, -1), 3,
        listOf(
            6, listOf(-13, 8), 4
        )
    )
    print(productSum(input))
}

fun productSum(array: List<*>, level: Int = 1): Int {
    var sum = 0
    for (item in array) {
        sum += if (item is List<*>) {
            productSum(item, level + 1)
        } else {
            item as Int
        }
    }
    return sum * level
}