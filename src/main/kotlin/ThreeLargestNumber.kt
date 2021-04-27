/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Find%20Three%20Largest%20Numbers
 */

fun main() {
    val mainArray = listOf(7, 7, 7, 7, 7, 7, 7, 7, 7, 7)
    print(findThreeLargestNumbers(mainArray))
}

fun findThreeLargestNumbers(array: List<Int>): List<Int> {
    var firstLargestNumber = Int.MIN_VALUE
    var secondLargestNumber = Int.MIN_VALUE
    var thirdLargestNumber = Int.MIN_VALUE

    array.forEach { item ->
        when {
            item >= thirdLargestNumber -> {
                firstLargestNumber = secondLargestNumber
                secondLargestNumber = thirdLargestNumber
                thirdLargestNumber = item
            }
            item in secondLargestNumber until thirdLargestNumber -> {
                firstLargestNumber = secondLargestNumber
                secondLargestNumber = item
            }
            item in firstLargestNumber until secondLargestNumber -> {
                firstLargestNumber = item
            }
        }
    }
    return listOf(firstLargestNumber, secondLargestNumber, thirdLargestNumber)
}