import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node; // Clase Node para Ejercicio 3
import java.util.List;

public class App {
    public static void main(String[] args) {
        runEjercicio1();
        runEjercicio2();
        runEjercicio3();
        runEjercicio4();
    }

    private static void runEjercicio1() {
        System.out.println("Ejercicio 1: Insertar en Árbol Binario de Búsqueda");
        InsertBSTTest tree = new InsertBSTTest();
        int[] values = {5, 3, 8, 2, 4, 7, 9};
        for (int value : values) {
            tree.insert(value);
        }
        System.out.println("Árbol en inOrden:");
        tree.printInOrder();
    }

    private static void runEjercicio2() {
        System.out.println("\nEjercicio 2: Invertir un Árbol Binario");
        InvertBinaryTree tree = new InvertBinaryTree();
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(4);
        root.left = new InvertBinaryTree.TreeNode(2);
        root.right = new InvertBinaryTree.TreeNode(7);
        root.left.left = new InvertBinaryTree.TreeNode(1);
        root.left.right = new InvertBinaryTree.TreeNode(3);
        root.right.left = new InvertBinaryTree.TreeNode(6);
        root.right.right = new InvertBinaryTree.TreeNode(9);

        System.out.println("Árbol original (InOrder):");
        tree.printInOrder(root);

        root = tree.invertTree(root);

        System.out.println("\nÁrbol invertido (InOrder):");
        tree.printInOrder(root);
    }

    private static void runEjercicio3() {
        System.out.println("\nEjercicio 3: Listar Niveles de un Árbol");
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        ListLevels levels = new ListLevels();
        List<List<Node>> result = levels.listLevels(root);

        System.out.println("Niveles:");
        for (List<Node> level : result) {
            for (Node node : level) {
                System.out.print(node.getValue() + " ");
            }
            System.out.println();
        }
    }

    private static void runEjercicio4() {
        System.out.println("\nEjercicio 4: Profundidad Máxima de un Árbol Binario");
        Depth tree = new Depth();
        Depth.TreeNode root = new Depth.TreeNode(1);
        root.left = new Depth.TreeNode(2);
        root.right = new Depth.TreeNode(3);
        root.left.left = new Depth.TreeNode(4);
        root.left.right = new Depth.TreeNode(5);

        int depth = tree.maxDepth(root);
        System.out.println("La profundidad máxima es: " + depth);
    }
}

