/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Remove%20Duplicates%20From%20Linked%20List
 */

fun main() {
    val input = addMany(LinkedList(1), listOf(1, 3, 4, 4, 4, 5, 6, 6))
    print(getNodesInArray(removeDuplicatesFromLinkedList(input)))
}

fun addMany(linkedList: LinkedList, values: List<Int>): LinkedList {
    var current = linkedList
    while (current.next != null) {
        current = current.next!!
    }
    for (value in values) {
        current.next = LinkedList(value)
        current = current.next!!
    }
    return linkedList
}

open class LinkedList(var value: Int) {
    var next: LinkedList? = null
}

fun getNodesInArray(linkedList: LinkedList?): List<Int> {
    val nodes = mutableListOf<Int>()
    var current: LinkedList? = linkedList
    while (current != null) {
        nodes.add(current.value)
        current = current.next
    }
    return nodes
}

fun removeDuplicatesFromLinkedList(linkedList: LinkedList): LinkedList {
    var current: LinkedList? = linkedList
    while (current?.next != null) {
        if (current.value == current.next!!.value) {
            current.next = current.next!!.next
        } else {
            current = current.next
        }
    }
    return linkedList
}