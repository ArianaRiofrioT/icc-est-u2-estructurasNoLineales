package main.Ejercicio_04_depth;
import main.Materia.Models.Node;

public class Depth {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
    }

    public void printInput(Node root) {
        if (root == null) return;

        System.out.println("       4");
        System.out.println("    2     7");
        System.out.println("  1   3  ");
        System.out.println("8");
    }
}
