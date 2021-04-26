/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Branch%20Sums
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
    tree.left!!.right!!.left = BinaryTree(10)

    val result = branchSums(tree)
    print(result)
}

open class BinaryTree(var value: Int) {
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}

fun branchSums(root: BinaryTree): List<Int> {
    val list = mutableListOf<Int>()
    calculateSum(0, root, list)
    return list
}

fun calculateSum(sum: Int, root: BinaryTree?, sumList: MutableList<Int>) {
    if (root == null) return

    val sumInValue = sum + root.value

    if (root.left == null && root.right == null) sumList.add(sumInValue)

    calculateSum(sumInValue, root.left, sumList)
    calculateSum(sumInValue, root.right, sumList)
}
