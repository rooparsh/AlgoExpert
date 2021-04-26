/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Node%20Depths
 */

fun main() {
    val i = Node("I")
    val j = Node("J")
    val k = Node("K")

    val e = Node("E")
    val f = Node("F")
    f.children.addAll(listOf(i, j))

    val g = Node("G")
    g.children.add(k)

    val h = Node("H")

    val b = Node("B")
    b.children.add(e)
    b.children.add(f)

    val c = Node("C")

    val d = Node("D")
    d.children.add(g)
    d.children.add(h)

    val graph = Node("A")
    graph.children.add(b)
    graph.children.add(c)
    graph.children.add(d)

    val expected = listOf("A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H")
    val output = graph.depthFirstSearch()
    print(output)
}

class Node(private val name: String) {
    val children = mutableListOf<Node>()

    fun depthFirstSearch(): List<String> {
        return depthFirstSearch(mutableListOf())
    }

    private fun depthFirstSearch(list: MutableList<String>): List<String> {
        list.add(name)
        for (child in children) {
            child.depthFirstSearch(list)
        }
        return list
    }
}
