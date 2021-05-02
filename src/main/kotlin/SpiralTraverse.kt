/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Spiral%20Traverse
 */

fun main() {
    val matrix = listOf(
        listOf(1, 2, 3, 4),
        listOf(12, 13, 14, 5),
        listOf(11, 16, 15, 6),
        listOf(10, 9, 8, 7)
    )
    print(spiralTraverse(matrix))
}

fun spiralTraverse(array: List<List<Int>>): List<Int> {
    var starRow = 0
    var endRow = array.size - 1
    var startCol = 0
    var endCol = array[0].size - 1

    val flatList = mutableListOf<Int>()
    while (starRow <= endRow && startCol <= endCol) {
        for (i in startCol..endCol) {
            flatList.add(array[starRow][i])
        }
        for (j in starRow + 1..endRow) {
            flatList.add(array[j][endCol])
        }
        for (k in endCol - 1 downTo startCol) {
            if (starRow == endRow) break
            flatList.add(array[endRow][k])
        }
        for (k in endRow - 1 downTo starRow + 1) {
            if (startCol == endCol) break
            flatList.add(array[k][startCol])
        }

        starRow++
        startCol++
        endCol--
        endRow--
    }
    return flatList
}
