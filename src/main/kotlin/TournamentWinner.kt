/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Tournament%20Winner
 */

fun main() {
    val competitions = listOf(
        listOf("HTML", "C#"),
        listOf("C#", "Python"),
        listOf("Python", "HTML")
    )
    val results = listOf(0, 0, 1)

    print("Answer is ${tournamentWinner(competitions, results)}")
}

fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
    val competitionsMap = competitions.flatten().associateWith { 0 } as HashMap<String, Int>

    results.forEachIndexed { index, i ->
        if (i == 0) {
            val key = competitions[index][1]
            competitionsMap[key] = competitionsMap[key]!! + 1
        }
        if (i == 1) {
            val key = competitions[index][0]
            competitionsMap[key] = competitionsMap[key]!! + 1
        }
    }

    return competitionsMap.maxByOrNull { it.value }!!.key
}
