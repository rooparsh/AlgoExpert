/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Nth%20Fibonacci
 */

fun main() {
    print(getNthFib(6))
}

fun getNthFib(n: Int): Int {
    if (n == 2) {
        return 1
    } else if (n == 1) {
        return 0
    }
    return getNthFib(n - 1) + getNthFib(n - 2)
}

fun getNthFibOptimal(n: Int): Int {
    var lastTwo = Pair(0, 1)
    var counter = 3
    while (counter <= n) {
        val next = lastTwo.first + lastTwo.second
        lastTwo = Pair(lastTwo.second, next)

        counter++
    }

    return if (n > 1) lastTwo.second else lastTwo.first
}