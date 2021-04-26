/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Node%20Depths
 */

fun main() {
    val tree = BinaryTree(1)
    tree.left = BinaryTree(2)
    tree.right = BinaryTree(3)
    tree.left!!.left = BinaryTree(4)
    tree.left!!.right = BinaryTree(5)
    tree.right!!.left = BinaryTree(6)
    tree.right!!.right = BinaryTree(7)
    tree.left!!.left!!.left = BinaryTree(8)
    tree.left!!.left!!.right = BinaryTree(9)

    val result = nodeDepths(tree)
    print(result)
}

fun nodeDepths(root: BinaryTree): Int {
    return nodeLevel(root, 0)
}

fun nodeLevel(root: BinaryTree?, depth: Int): Int {
    if (root == null) return 0
    return depth + nodeLevel(root.left, depth + 1) + nodeLevel(root.right, depth + 1)
}
