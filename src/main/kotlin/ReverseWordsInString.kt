/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Reverse%20Words%20In%20String
 */

fun main() {
    val input = "AlgoExpert is the best!"
    print(reverseWordsInString(input))
}


// abc is
fun reverseWordsInString(string: String): String {
    val list = mutableListOf<String>()
    string.forEach {
        list.add(it.toString())
    }
    reverseString(list, 0, list.size - 1)
    // si cba
    var starIdx = 0
    var endIdx: Int = 0
    while (endIdx < list.size) {
        if (list[endIdx] != " ") {
            endIdx++
            if (endIdx == list.size - 1) {
                reverseString(list, starIdx, endIdx)
                starIdx = endIdx + 1
                endIdx = starIdx
            }
        } else {
            reverseString(list, starIdx, endIdx)
            starIdx = endIdx + 1
            endIdx = starIdx
        }
    }

    return list.joinToString("")
}

fun reverseString(mutableList: MutableList<String>, start: Int, end: Int) {
    var startIdx = start
    var endIdx = end

    while (startIdx < endIdx) {
        val temp = mutableList[startIdx]
        mutableList[startIdx] = mutableList[endIdx]
        mutableList[endIdx] = temp
        startIdx++
        endIdx--
    }
}