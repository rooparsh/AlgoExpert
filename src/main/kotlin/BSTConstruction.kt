/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/BST%20Construction
 */

fun main() {
    val root = BST(10)
    root.left = BST(5)
    root.left!!.left = BST(2)
    root.left!!.left!!.left = BST(1)
    root.left!!.right = BST(5)
    root.right = BST(15)
    root.right!!.left = BST(13)
    root.right!!.left!!.right = BST(14)
    root.right!!.right = BST(22)

    root.insert(12)
    assert(root.right!!.left!!.left != null)
    assert(root.right!!.left!!.left!!.value == 12)

//    root.remove(10)
    assert(root.contains(10))
    assert(root.value == 12)

    assert(root.contains(15))
}

open class BST(var value: Int) {
    var left: BST? = null
    var right: BST? = null

    fun insert(value: Int): BST {
        if (value < this.value) {
            if (this.left == null) {
                this.left = BST(value)
            } else {
                this.left?.insert(value)
            }
        } else if (value > this.value) {
            if (this.right == null) {
                this.right = BST(value)
            } else {
                this.right?.insert(value)
            }
        }
        return this
    }

    fun contains(value: Int): Boolean {
        if (value < this.value) {
            return if (this.left == null) {
                false
            } else this.contains(value)
        } else if (value > this.value) {
            return if (this.right == null) {
                false
            } else this.contains(value)
        }
        return true
    }

    fun remove(value: Int): BST {
        // Write your code here.
        // Do not edit the return statement of this method.
        return this
    }
}