/* package colaarreglo;

public class ColaArreglo {
  private int TAM_MAX = 5;
  private int[] elementos = new int[TAM_MAX];
  private int frente, cola;

  public ColaArreglo() {
    frente = -1;
    cola = -1;
  }

  boolean estaLlena() {
    return frente == 0 && cola == TAM_MAX - 1;
  }

  boolean esVacia() {
      return frente == -1;
  }

  void enQueue(int elemento) {
    if (estaLlena()) {
      System.out.println("la cola está llena");
    } else {
      if (frente == -1)
        frente = 0;
      cola++;
      elementos[cola] = elemento;
      System.out.println("Insertado " + elemento);
    }
  }

  int deQueue() {
    int elemento;
    if (esVacia()) {
      System.out.println("la cola está vacía");
      return (-1);
    } else {
      elemento = elementos[frente];
      if (frente >= cola) {
        frente = -1;
        cola = -1;
      } 
      else {
        frente++;
      }
      System.out.println("Borrado -> " + elemento);
      return (elemento);
    }
  }

  void imprime() {
    // Function to display elements of Queue
    int i;
    if (esVacia()) {
      System.out.println("Vacia");
    } else {
      System.out.println("\nIIndice frente-> " + frente);
      System.out.println("Elementos -> ");
      for (i = frente; i <= cola; i++)
        System.out.print(elementos[i] + "  ");

      System.out.println("\nUltimoIndice-> " + cola);
    }
  }

 
} */