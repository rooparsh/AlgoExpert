/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Array%20Of%20Products
 */

fun main() {
    val mainArray = listOf(5, 1, 4, 2)
    print(arrayOfProducts(mainArray))
}

fun arrayOfProducts(array: List<Int>): List<Int> {
    val list = mutableListOf<Int>()
    for (i in array.indices) {
        var multiplex = 1
        for (j in array.indices) {
            if (i != j) {
                multiplex *= array[j]
            }
        }
        list.add(multiplex)
    }
    return list
}
