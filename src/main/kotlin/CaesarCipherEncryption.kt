/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Caesar%20Cipher%20Encryptor
 */

fun main() {
    print(caesarCipherEncryptor("xyz", 2))
}

fun caesarCipherEncryptor(string: String, key: Int): String =
    string.toList().map { it.toInt() + (key % 26) }.joinToString(separator = "") { newInt ->
        if (newInt <= 122) newInt.toChar().toString() else (96 + (newInt % 122)).toChar().toString()
    }
