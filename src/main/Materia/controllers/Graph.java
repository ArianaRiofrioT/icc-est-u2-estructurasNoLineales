package main.Materia.Controllers;
public class NodeG addNode(int value) { 

    NodeG newNode = new NodeG(value);
    nodes.add(newNode); 
    return newNode; 
}


public void addEdge(NodeG src, NodeG dest) {
    if (nodes.contains(src) && nodes.contains(dest)) {
        src.neighbors.add(dest); 
    }
}

public void printGraph() {
    for (NodeG node : nodes) {
        System.out.print("Nodo " + node.value + " conectado a: ");
        for (NodeG neighbor : node.neighbors) {
            System.out.print(neighbor.value + " ");
        }
        System.out.println();
    }
}
