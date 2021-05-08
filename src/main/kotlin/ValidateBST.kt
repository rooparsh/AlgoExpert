/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Validate%20BST
 */

fun main() {
    val tree = BST(10)
    tree.left = BST(5)
    tree.left!!.left = BST(2)
    tree.left!!.left!!.left = BST(1)
    tree.left!!.right = BST(5)
    tree.right = BST(15)
    tree.right!!.right = BST(22)

    print(validateBst(tree))
}

fun validateBst(tree: BST): Boolean {
    return validateBstHelper(tree, Int.MIN_VALUE, Int.MAX_VALUE)
}

fun validateBstHelper(tree: BST?, minValue: Int = Int.MIN_VALUE, maxValue: Int = Int.MAX_VALUE): Boolean {
    if (tree == null) return true
    if (tree.value < minValue || tree.value >= maxValue) return false

    val leftValid = validateBstHelper(tree.left, minValue, tree.value)
    val rightValid = validateBstHelper(tree.right, tree.value, maxValue)
    return leftValid && rightValid
}