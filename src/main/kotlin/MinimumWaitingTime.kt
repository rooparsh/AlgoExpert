/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Minimum%20Waiting%20Time
 */

fun main() {
    print(minimumWaitingTime(mutableListOf(3, 2, 1, 2, 6)))
}

fun minimumWaitingTime(queries: MutableList<Int>): Int {
    queries.sort()
    var waitingTime = 0
    for (id in 0 until queries.size) {
        val duration = queries[id]
        val left = queries.size - (id + 1)
        waitingTime += duration * left

    }
    return waitingTime
}