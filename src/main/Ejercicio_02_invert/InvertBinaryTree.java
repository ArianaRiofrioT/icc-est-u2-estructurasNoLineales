package main.Ejercicio_02_invert;

public class InvertBinaryTree {

    public static class TreeNode {
        public int value; // Cambiado a public
        public TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.value + " ");
            printInOrder(node.right);
        }
    }
}
