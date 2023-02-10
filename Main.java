//import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*System.out.print("Ingrese un texto: ");
        Scanner sc = new Scanner(System.in);
        String valor = sc.next();
        System.out.println(valor);
        


        Pila pila = new Pila();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        if(pila.top() != null) {
            System.out.println("Cima: " + pila.top());
        }

        pila.printPila();
        pila.clear();
        */
        Nodo<Integer> nodo1 = new Nodo<Integer>();
        Nodo<Integer> nodo2 = new Nodo<Integer>();
        Nodo<Integer> nodo3 = new Nodo<Integer>();

        nodo1.setSig(nodo2);
        nodo2.setSig(nodo3);
        nodo2.setAnt(nodo1);
    }
}