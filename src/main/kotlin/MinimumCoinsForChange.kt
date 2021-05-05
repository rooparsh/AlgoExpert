/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Min%20Number%20Of%20Coins%20For%20Change
 */

fun main() {
    val denoms = listOf(3, 5)
    val output = minNumberOfCoinsForChange(9, denoms)
    print(output)
}

fun minNumberOfCoinsForChange(n: Int, denoms: List<Int>): Int {
    val list = denoms.sortedDescending()
    var count = 0
    var coinIndex = 0
    var left = n

    while (left >= 0 && coinIndex <= list.size - 1) {
        val coin = list[coinIndex]
        val divisor = left / coin
        if (divisor != 0) {
            count += divisor
        }

        val remainder = left % coin
        if (remainder != 0) {
            left = remainder
            coinIndex++
        } else {
            break
        }
        println("Coin : $coin , Count : $divisor, Remaining : $remainder, Final Count: $count")

    }

    return count
}