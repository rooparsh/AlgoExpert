/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Non-Constructible%20Change
 */

fun main() {
    val input = mutableListOf(5, 7, 1, 1, 2, 3, 22)
    print(nonConstructibleChange(input))
}

fun nonConstructibleChange(coins: MutableList<Int>): Int {
    coins.sort()
    var currentChangeCreated = 0
    for (coin in coins) {
        if (coin > currentChangeCreated + 1) {
            return currentChangeCreated + 1
        }
        currentChangeCreated += coin
    }
    return currentChangeCreated + 1
}