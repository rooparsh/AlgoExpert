import java.lang.StringBuilder

/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Run-Length%20Encoding
 */

fun main() {
    print(runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"))
}

fun runLengthEncoding(string: String): String {
    val list = mutableListOf<Char>()
    var currentLength = 1

    for (i in 1 until string.length) {
        val currentChar = string[i]
        val prevChar = string[i - 1]
        if (currentChar != prevChar || currentLength == 9) {
            list.add(currentLength.toString()[0])
            list.add(prevChar)
            currentLength = 0
        }
        currentLength++
    }

    list.add(currentLength.toString()[0])
    list.add(string[string.length - 1])
    return list.joinToString("")
}
