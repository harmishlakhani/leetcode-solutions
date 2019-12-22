package com.techmisal.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
 * Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.
 * 
 * Note:
 *  1. The number of nodes will be between 1 and 100.
 *  2. The undirected graph is a simple graph, which means no repeated edges and no self-loops in the graph.
 *  3. Since the graph is undirected, if node p has node q as neighbor, then node q must have node p as neighbor too.
 *  4. You must return the copy of the given node as a reference to the cloned graph.
 */
public class CloneGraph {
    // Definition for a Node.
    public static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
        }

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    };

    private HashMap<Node, Node> clones = new HashMap<>();

    public Node cloneGraph(Node node) {
        clones.clear();
        return cloneNode(node);
    }

    private Node cloneNode(Node node) {
        if (clones.containsKey(node)) {
            return clones.get(node);
        }
        Node clonedNode = new Node();
        clones.put(node, clonedNode);

        List<Node> clonedNeighbors = new ArrayList<>();
        for (Node neighBor : node.neighbors) {
            clonedNeighbors.add(cloneNode(neighBor));
        }

        clonedNode.val = node.val;
        clonedNode.neighbors = clonedNeighbors;
        return clonedNode;
    }
}