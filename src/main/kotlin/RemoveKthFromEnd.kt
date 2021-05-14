/**
 * Difficulty : Medium
 * Problem Statement : https://www.algoexpert.io/questions/Remove%20Kth%20Node%20From%20End
 */

fun main() {
    val linkedList = LinkedList(0)
    addAll(linkedList, listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))

    removeKthNodeFromEnd(linkedList, 10)
    val result = getNodeValuesInArray(linkedList)
    val expected = listOf(0, 1, 2, 3, 4, 5, 7, 8, 9)

    print(result)
    assert(result == expected)
}

fun removeKthNodeFromEnd(head: LinkedList, k: Int) {
    var firstHead: LinkedList? = head
    var secondHead: LinkedList? = head
    var counter = 1
    while (counter <= k) {
        secondHead = secondHead!!.next
        counter++

    }

    if (secondHead == null) {
        head.value = head.next!!.value
        head.next = head.next!!.next
        return
    }

    while (secondHead!!.next != null) {
        secondHead = secondHead.next
        firstHead = firstHead?.next
    }

    firstHead?.next = firstHead?.next!!.next
}

fun addAll(ll: LinkedList, values: List<Int>) {
    var current = ll
    for (value in values) {
        val newLL = LinkedList(value)
        current.next = newLL
        current = newLL
    }
}

fun getNodeValuesInArray(linkedList: LinkedList): List<Int> {
    val values = mutableListOf<Int>()
    var current: LinkedList? = linkedList
    while (current != null) {
        values.add(current.value)
        current = current.next
    }
    return values
}

