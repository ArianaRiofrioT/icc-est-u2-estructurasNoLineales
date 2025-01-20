package main.Ejercicio_01_insert;

import java.util.LinkedList;
import java.util.Queue;

import main.Materia.Models.Node;

public class InsertBSTTest {
    public Node insert(Node root, int value) {

        if (root == null) {
            root = new Node(value);
        } else {
            if (value < root.getValue()) {
                root.setLeft(insert(root.getLeft(), value));
            } else if (value > root.getValue()) {
                root.setRight(insert(root.getRight(), value));
            }
        }
        return root;
    }

    public void printTreeAligned(Node root) {
        if (root == null) {
            System.out.println("Árbol vacío.");
            return;
        }
        
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        int height = getTreeHeight(root);
        int currentLevel = 0;

        while (!nodes.isEmpty() && currentLevel <= height) {
            int levelNodes = nodes.size();
            printSpaces((int) Math.pow(2, height - currentLevel) - 1);

            for (int i = 0; i < levelNodes; i++) {
                Node current = nodes.poll();
                if (current != null) {
                    System.out.print(current.getValue());
                    nodes.add(current.getLeft());
                    nodes.add(current.getRight());
                } else {
                    System.out.print(" ");
                    nodes.add(null);
                    nodes.add(null);
                }
                if (i < levelNodes - 1) {
                    printSpaces((int) Math.pow(2, height - currentLevel + 1) - 1);
                }
            }
            System.out.println();
            currentLevel++;
        }
    }

    private int getTreeHeight(Node root) {
        return (root == null) ? -1 : 1 + Math.max(getTreeHeight(root.getLeft()), getTreeHeight(root.getRight()));
    }

    private void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    public Node generateTree(int[] valoresArbol) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'generateTree'");
    }
}