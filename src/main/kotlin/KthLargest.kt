/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Find%20Kth%20Largest%20Value%20In%20BST
 */

fun main() {
    val root = BST(15)
    root.left = BST(5)
    root.left!!.left = BST(2)
    root.left!!.left!!.left = BST(1)
    root.left!!.left!!.right = BST(3)
    root.left!!.right = BST(5)
    root.right = BST(20)
    root.right!!.left = BST(17)
    root.right!!.right = BST(22)
    val k = 3
    val expected = 17
    print(findKthLargestValueInBst(root, k))
}

fun findKthLargestValueInBst(tree: BST, k: Int): Int {
    // Write your code here.
    val list = reverseInOrderTraversal(tree, mutableListOf())
    println(list)
    return list[k - 1]
}

fun reverseInOrderTraversal(tree: BST, list: MutableList<Int>): MutableList<Int> {
    if (tree.right != null) {
        reverseInOrderTraversal(tree.right!!, list)
    }

    list.add(tree.value)

    if (tree.left != null) {
        reverseInOrderTraversal(tree.left!!, list)
    }
    return list
}
