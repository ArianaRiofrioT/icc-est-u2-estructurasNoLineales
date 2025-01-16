package main.Ejercicio_03_listLevels;
import main.Materia.Models.Node;
import java.util.*;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> levels = new ArrayList<>();
        if (root == null) return levels;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int nodesAtLevel = queue.size();
            List<Node> currentLevel = new ArrayList<>();

            for (int i = 0; i < nodesAtLevel; i++) {
                Node current = queue.poll();
                currentLevel.add(current);

                if (current.getLeft() != null) queue.add(current.getLeft());
                if (current.getRight() != null) queue.add(current.getRight());
            }

            levels.add(currentLevel);
        }
        return levels;
    }
}