import kotlin.math.abs

/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Find%20Closest%20Value%20In%20BST
 */

fun main() {
    val tree = BST(10)
    tree.left = BST(5)
    tree.left!!.left = BST(2)
    tree.left!!.left!!.left = BST(1)
    tree.left!!.right = BST(5)
    tree.right = BST(15)
    tree.right!!.left = BST(13)
    tree.right!!.left!!.right = BST(14)
    tree.right!!.right = BST(22)

    findClosestValueInBst(tree, 12)
}
fun findClosestValueInBst(tree: BST, target: Int): Int {
    return findClosestValueInBstWithValue(tree, target, tree.value)
}

fun findClosestValueInBstWithValue(tree: BST, target: Int, closest: Int): Int {
    var newClosest = closest

    if (abs(target - closest) > abs(target - tree.value)) {
        newClosest = tree.value
    }

    return if (target < tree.value && tree.left != null) {
        findClosestValueInBstWithValue(tree.left!!, target, newClosest)
    } else if (target > tree.value && tree.right != null) {
        findClosestValueInBstWithValue(tree.right!!, target, newClosest)
    } else {
        newClosest
    }
}