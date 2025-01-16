package main.Ejercicio_04_depth;

public class Depth {

    public static class TreeNode {
        public int value; // Cambiado a public
        public TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
