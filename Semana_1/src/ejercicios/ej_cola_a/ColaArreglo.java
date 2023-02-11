package ejercicios.ej_cola_a;
import java.util.ArrayList;

public class ColaArreglo<T> {
    private int TAM_MAX = 5;
    private ArrayList<T> elementos;
    private int frente, cola;

    public ColaArreglo() {
        elementos = new ArrayList<T>();
        frente = -1;
        cola = -1;
    }

    // public ColaArreglo() {
    //     frente = -1;
    //     cola = -1;
    // }

    boolean estaLlena() {
        return frente == 0 && cola == TAM_MAX - 1;
    }
    
    boolean esVacia() {
      return frente == -1;
    }
    
    void enQueue(T elemento) {
        if (estaLlena()) {
            System.out.println("la cola está llena");
        } else {
            if (frente == -1) {
                frente = 0;
            }
            cola++;
            elementos.add(elemento);
            System.out.println("Insertado " + elemento);
        }
    }
    
    public int deQueue() {
        T elemento;
        if (esVacia()) {
            System.out.println("la cola está vacía");
            return (-1);
            // return null;
        } else {
            elemento = elementos.get(frente);
            if (frente >= cola) {
                frente = -1;
                cola = -1;
            }else {
                frente++;
            }
            System.out.println("Borrado -> " + elemento);
            return 0;
        }
    }
    
    void imprime() {
    /* Function to display elements of Queue */
        int i;
        if (esVacia()) {
            System.out.println("Vacia");
        } else {
            System.out.println("\nIIndice frente-> " + frente);
            System.out.println("Elementos -> ");
            for (i = frente; i <= cola; i++) {
                System.out.print(elementos.get(i) + "  ");
            }
            System.out.println("\nUltimo Indice-> " + cola);
        }
    }
}