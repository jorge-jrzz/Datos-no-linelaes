package ejercicios.ej_cola_a;
import java.lang.reflect.Array;

public class ColaArreglo <T> {
    private int TAM_MAX = 5;
    private T[] elementos;
    private int frente, cola;

    public ColaArreglo() {
        frente = -1;
        cola = -1;
    }

    public ColaArreglo(Class<T> clazz) {
        // @SuppressWarnings("unchecked")
        elementos = (T[]) Array.newInstance(clazz, TAM_MAX);
    }

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
            elementos[cola] = elemento;
            System.out.println("Insertado " + elemento);
        }
    }
    
    T deQueue() {
        T elemento;
        if (esVacia()) {
            System.out.println("la cola está vacía");
            return null;
        } else {
            elemento = elementos[frente];
            if (frente >= cola) {
                frente = -1;
                cola = -1;
            }else {
                frente++;
            }
            System.out.println("Borrado -> " + elemento);
            return elemento;
        }
    }
    
    void imprime() {
    //  Function to display elements of Queue 
        int i;
        if (esVacia()) {
            System.out.println("Vacia");
        } else {
            System.out.println("\nIndice frente-> " + frente);
            System.out.println("Elementos -> ");
            for (i = frente; i <= cola; i++) {
                System.out.print(elementos[i] + "  ");
            }
            System.out.println("\nUltimo Indice-> " + cola);
        }
    }
}
