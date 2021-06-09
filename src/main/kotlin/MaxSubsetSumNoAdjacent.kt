/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Max%20Subset%20Sum%20No%20Adjacent
 */

fun main() {
    print(maxSubsetSumNoAdjacent(listOf(75, 105, 120, 75, 90, 135)))
}

fun maxSubsetSumNoAdjacent(array: List<Int>): Int {
    if (array.isEmpty()) {
        return 0
    }
    if (array.size == 1) {
        return array[0]
    }

    var incl: Int = array[0]
    var excl = 0
    var newExcl: Int


    var i = 1
    while (i < array.size) {

        newExcl = if (incl > excl) incl else excl
        incl = excl + array[i]
        excl = newExcl
        i++
    }
    return if (incl > excl) incl else excl
}