/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Palindrome%20Check
 */

fun main() {
    print(isPalindrome("abcdcba"))
}

fun isPalindrome(string: String): Boolean {
    var leftIndex = 0
    var rightIndex = string.length - 1

    while (leftIndex < rightIndex) {
        if (string[leftIndex] != string[rightIndex]) return false
        leftIndex++
        rightIndex--
    }
    return true
}
