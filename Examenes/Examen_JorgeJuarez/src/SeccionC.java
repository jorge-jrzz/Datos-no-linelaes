public class SeccionC<T> {

    static class BinaryTree <T> {
        public Nodo<T> root;
    
        public BinaryTree() {}
    }

// Funcion que imprime el Árbol en Indorden

    void print(Nodo<T> nodo) {
        if(nodo == null) {
            return;
        }else {
            print(nodo.getLeft());
            System.out.print(nodo.getValor() + " ");
            print(nodo.getRight());
        }
    }

// Ejercicion 1 de la Sección C del examen practico, "Elige un programa de la lista de problemas de práctica.":
// 7.	Escriba un programa que calcule e imprima cuántos nodos tiene un árbol binario.

    int countNodes(Nodo<T> root) {
        if (root == null) {
            return 0;
        }else {
            return 1 + countNodes(root.getLeft()) + countNodes(root.getRight());
        }
    }

// Ejercicion 2 de la Sección C del examen practico, "Crear un programa que, dada la raíz de un árbol binario calcule la multiplicatoria (multiplicación) de todos los valores de los nodos"

    int multiplicacion(Nodo<T> nodo) {
        if (nodo == null) {
            return 1;
        }else {
            int mulLeft = multiplicacion(nodo.getLeft());
            int mulright = multiplicacion(nodo.getRight());
            return mulLeft * mulright * (int)nodo.getValor();
        }
    }

// Ejercicio 3 de la Seccion C del examen practico, "Crea un programa que, dada la raíz de un árbol binario, modifique sus niveles pares para hacerlos espejo.":

    void mirror(Nodo<T> root, int nivel) {
        if(root == null) {
            return;
        }
        if(nivel % 2 == 0) {
            Nodo<T> temp = root.getLeft();
            root.setLeft(root.getRight());
            root.setRight(temp);
        }

        mirror(root.getLeft(), nivel + 1);
        mirror(root.getRight(), nivel + 1);
    }

/*
El Árbol que se formo tiene la siguiente forma: 
          20
        /   \
       19   24
      / \   /  \
     2   1  5   6

El Árbol resultante: (se cambia el 1 con el 2, y el 6 con el 5)
          20
        /   \
       19   24
      / \   /  \
     1   2  6   5
*/

    public static void main(String[] args) {

// Se crea un objeto de tipo Árbol binario y mediante los getters y setters se incorporan los nodos
        BinaryTree<Integer> tree = new BinaryTree<Integer>();
        tree.root = new Nodo<Integer>(20);
        tree.root.setLeft(new Nodo<Integer>(19));
        tree.root.setRight(new Nodo<Integer>(24));
        tree.root.getLeft().setLeft(new Nodo<Integer>(2));
        tree.root.getLeft().setRight(new Nodo<Integer>(1));
        tree.root.getRight().setLeft(new Nodo<Integer>(5));
        tree.root.getRight().setRight(new Nodo<Integer>(6));

        SeccionC<Integer> func = new SeccionC<Integer>();

        // Imprimimos los resultados
        System.out.println("\nEl número de nodos en el árbol es: " + func.countNodes(tree.root));
        System.out.println("El resultado de la Multiplicacion del valor de todos los nodos del árbol es: " + func.multiplicacion(tree.root));
        System.out.println("Árbol en Indorden:");
        func.print(tree.root);
        System.out.println("\n\nSe aplico el efecto de espejo a los valores que se encontraban en un nivel par: \n");
        func.mirror(tree.root, 1);
        System.out.println("Árbol en Indorden:");
        func.print(tree.root);
    }
}
