/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Generate%20Document
 */

fun main() {
    val characters = " "
    val document = "Hello"
    print(generateDocument(characters, document))
}

fun generateDocument(characters: String, document: String): Boolean {
    val charactersMap = HashMap<Char, Int>()

    characters.forEach {
        charactersMap[it] = charactersMap.getOrDefault(it, 0) + 1
    }

    val documentsMap = HashMap<Char, Int>()

    document.forEach {
        documentsMap[it] = documentsMap.getOrDefault(it, 0) + 1
    }

    documentsMap.entries.forEach { doc ->
        if (charactersMap.containsKey(doc.key).not()) {
            return false
        }
        if (charactersMap[doc.key]!! < doc.value) {
            return false
        }
    }
    return true
}
