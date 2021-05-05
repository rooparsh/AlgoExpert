/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/BST%20Traversal
 */

fun main() {
    val tree = BST(10)
    tree.left = BST(5)
    tree.left!!.left = BST(2)
    tree.left!!.left!!.left = BST(1)
    tree.left!!.right = BST(5)
    tree.right = BST(15)
    tree.right!!.right = BST(22)

    println(inOrderTraverse(tree, mutableListOf()))
    println(preOrderTraverse(tree, mutableListOf()))
    println(postOrderTraverse(tree, mutableListOf()))
}

fun inOrderTraverse(tree: BST, array: MutableList<Int>): List<Int> {
    if (tree.left != null) {
        inOrderTraverse(tree.left!!, array)
    }

    array.add(tree.value)

    if (tree.right != null) {
        inOrderTraverse(tree.right!!, array)
    }
    return array
}

fun preOrderTraverse(tree: BST, array: MutableList<Int>): List<Int> {
    array.add(tree.value)
    if (tree.left != null) {
        preOrderTraverse(tree.left!!, array)
    }
    if (tree.right != null) {
        preOrderTraverse(tree.right!!, array)
    }
    return array
}

fun postOrderTraverse(tree: BST, array: MutableList<Int>): List<Int> {
    if (tree.left != null) {
        postOrderTraverse(tree.left!!, array)
    }
    if (tree.right != null) {
        postOrderTraverse(tree.right!!, array)
    }
    array.add(tree.value)

    return array
}