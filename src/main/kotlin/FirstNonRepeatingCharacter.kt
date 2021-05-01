/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/First%20Non-Repeating%20Character
 */

fun main() {
    print(firstNonRepeatingCharacter(""))
}

fun firstNonRepeatingCharacter(string: String): Int {
    val map = HashMap<Char, Pair<Int, Int>>()

    string.forEachIndexed { index, c ->
        if (map.containsKey(c)) {
            map[c] = Pair(map[c]!!.first, map[c]!!.second.plus(1))
        } else {
            map[c] = Pair(index, 1)
        }
    }

    return map.entries.firstOrNull { it.value.second == 1 }?.value?.first ?: -1
}