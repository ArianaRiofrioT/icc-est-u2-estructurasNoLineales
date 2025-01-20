package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import main.Materia.Models.NodeG;

public class Graph {
    private List<NodeG> nodes;

    // Constructor
    public Graph() {
        nodes = new ArrayList<>();
    }

    // Agregar un nodo
    public NodeG addNode(int value) {
        NodeG newNode = new NodeG(value);
        nodes.add(newNode);
        return newNode;
    }

    
    public void addEdge(NodeG src, NodeG dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src); 
    }

    
    
    public void addDirectedEdge(NodeG src, NodeG dest) {
    // Para grafos dirigidos, solo agregamos la relación de src -> dest
        src.addNeighbor(dest);
    }   

    
    public void getDFS(NodeG startNode) {
        Set<NodeG> visited = new HashSet<>();
        System.out.println("DFS desde el node" + startNode.getValue() + " :");
        getDFSUtil(startNode, visited);
        
    }

    private void getDFSUtil(NodeG node, Set<NodeG> visited) {
        if (node == null || visited.contains(node)) {
            return;
        }
        visited.add(node);
        System.out.print(node.getValue() + " ");

        for (NodeG neighbor : node.getNeighbors()) {
            getDFSUtil(neighbor, visited);
        }
    }
    
    public void getBFS(NodeG startNode) {
        if (startNode == null) return;

        Queue<NodeG> queue = new LinkedList<>();
        Set<NodeG> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            NodeG currentNode = queue.poll();
            System.out.print(currentNode.getValue() + " ");

            for (NodeG neighbor : currentNode.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    
    public int[][] getAdjacencyMatrix() {
        int size = nodes.size();
        int[][] adjacencyMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            NodeG node = nodes.get(i);
            for (NodeG neighbor : node.getNeighbors()) {
                int j = nodes.indexOf(neighbor);
                adjacencyMatrix[i][j] = 1;
            }
        }
        return adjacencyMatrix;
    }

    public void printGraph() {
        for (NodeG nodeg : nodes){
            System.out.print("Vertice: " + nodeg.getValue() + ": " );
            for(NodeG neighbor : nodeg.getNeighbors()){
                System.out.print(neighbor.getValue() + " - ");
            }
            System.out.println();
        }
    }
    
    public void printAdjacencyMatrix() {
        int[][] matrix = getAdjacencyMatrix();
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


}