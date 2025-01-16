package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        Node left = root.getLeft();
        root.setLeft(invertTree(root.getRight()));
        root.setRight(invertTree(left));

        return root;
    }

    public void printTreeAligned(Node root) {
        if (root == null) {
            System.out.println("Árbol vacío.");
            return;
        }

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        int height = getTreeHeight(root);
        int level = 0;

        while (!queue.isEmpty() && level <= height) {
            int levelSize = queue.size();
            printSpaces((int) Math.pow(2, height - level) - 1);

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                if (current != null) {
                    System.out.print(current.getValue());
                    queue.add(current.getLeft());
                    queue.add(current.getRight());
                } else {
                    System.out.print(" ");
                    queue.add(null);
                    queue.add(null);
                }
                if (i < levelSize - 1) {
                    printSpaces((int) Math.pow(2, height - level + 1) - 1);
                }
            }
            System.out.println();
            level++;
        }
    }

    private int getTreeHeight(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(getTreeHeight(root.getLeft()), getTreeHeight(root.getRight()));
    }

    private void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
