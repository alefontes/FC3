import java.util.*;
public class GenericTree {


//Creación del arbol con main
public static void main(String[] args){
    Node root = newNode(10);
    (root.child).add(newNode(2));
    (root.child).add(newNode(34));
    (root.child).add(newNode(56));
    (root.child).add(newNode(100));
    (root.child.get(0).child).add(newNode(77));
    (root.child.get(0).child).add(newNode(88));
    (root.child.get(2).child).add(newNode(1));
    (root.child.get(3).child).add(newNode(7));
    (root.child.get(3).child).add(newNode(8));
    (root.child.get(3).child).add(newNode(9));
    (root.child.get(0).child).add(newNode(11)); 
    (root.child.get(0).child.get(0).child).add(newNode(88));
    (root.child.get(3).child.get(1).child).add(newNode(12));
    System.out.println("Orden Transversal");
    System.out.println("Configuracion:  Nodo:Cantidad de hijos");
    OrdenTransversal(root);
    Eliminar(root);
     root = newNode(11);
    (root.child).add(newNode(3));
    (root.child).add(newNode(35));
    (root.child).add(newNode(57));
    (root.child).add(newNode(101));
    (root.child.get(0).child).add(newNode(78));
    (root.child.get(0).child).add(newNode(89));
    (root.child.get(2).child).add(newNode(2));
    OrdenTransversal(root);
}

//Representacion de un nodo del generic tree
static class Node{
    int key;
    ArrayList<Node >child = new ArrayList<>();
};
 
// Funcion para crear un nuevo nodo
static Node newNode(int key){
    Node temp = new Node();
    temp.key = key;
    return temp;
}
 
//Imprimir los niveles del generic tree
static void OrdenTransversal(Node root){
    if (root == null)
        return;
 
    // Organizar por niveles usando una cola
    Queue<Node > q = new LinkedList<>(); //Crear una cola
    q.add(root); // Encolar la raiz
    while (!q.isEmpty()) {
        int n = q.size();
        //Accion si el nodo tiene hijos
        while (n > 0){
            // Desplegar un elemento de la cola e imprimir
            Node p = q.peek();
            q.remove();
            System.out.print(p.key);

            // Encolar todos los hijos de una cola
            for (int i = 0; i < p.child.size(); i++){
                q.add(p.child.get(i));
            }
            System.out.print(":"+p.child.size()+"  ");
            n--;
        }    
        //Impresion de niveles
        System.out.println();
        System.out.println();
    }
}
    static void Eliminar(Node root) {
        root=null;
        System.out.println("Arbol eliminado");
        System.out.println("");
    }
}
