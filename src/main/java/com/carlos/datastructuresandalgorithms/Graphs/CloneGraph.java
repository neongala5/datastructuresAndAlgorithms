package com.carlos.datastructuresandalgorithms.Graphs;

import java.util.*;
class CloneGraph {
    // Copied from solution and rewriten to how i usually code.
    // best to skip this one since the instructions arent very clear.
    private HashMap <Node, Node> visited = new HashMap <> ();
    public Node cloneGraph(Node node) {
        if (node == null) return node;

        if (visited.containsKey(node)) return visited.get(node);

        Node cloneNode = new Node(node.val, new ArrayList<Node>());
        visited.put(node, cloneNode);

        for (Node neighbor: node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }
        return cloneNode;
    }
}