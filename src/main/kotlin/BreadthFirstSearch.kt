import java.util.*

/**
 * Difficulty : Easy
 * Problem Statement : https://www.algoexpert.io/questions/Node%20Depths
 */

fun main() {
    val i = NodeB("I")
    val j = NodeB("J")
    val k = NodeB("K")

    val e = NodeB("E")
    val f = NodeB("F")
    f.children.addAll(listOf(i, j))

    val g = NodeB("G")
    g.children.add(k)

    val h = NodeB("H")

    val b = NodeB("B")
    b.children.add(e)
    b.children.add(f)

    val c = NodeB("C")

    val d = NodeB("D")
    d.children.add(g)
    d.children.add(h)

    val graph = NodeB("A")
    graph.children.add(b)
    graph.children.add(c)
    graph.children.add(d)

    val expected = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K")
    val output = graph.breadthFirstSearch()
    print(output)
}

class NodeB(private val name: String) {
    val children = mutableListOf<NodeB>()

    fun breadthFirstSearch(): List<String> {
        val list = mutableListOf<String>()
        val queue: Queue<NodeB> = LinkedList()
        queue.add(this)
        while (queue.size != 0) {
            val current = queue.poll()
            list.add(current.name)
            queue.addAll(current.children)
        }
        return list
    }
}
