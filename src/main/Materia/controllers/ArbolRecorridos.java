package main.Materia.Controllers;

import java.util.Stack;
import main.Materia.Models.Node;
public class ArbolRecorridos {

    public void preOrderIterativo(Node root) {
    
        public void preOrderRecursivo(Node root) {
        // VERIFICAR SI NO ESTÁ VACÍO 
        if (root == null) {
            return;
            System.out.print(node.getValue() + ", ");
            preOrderRecursivo(node.get.Left());
            preOrderRecursivo(node.get.Right());
        if (root == null) {
        
        }
        }

        // PILA PARA MANEJAR LOS NODOS DEL ÁRBOL DURANTE EL RECORRIDO
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.getValue() + ", "); 


            if (node.getRight() != null) { 
                stack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
        
    }

}
}
