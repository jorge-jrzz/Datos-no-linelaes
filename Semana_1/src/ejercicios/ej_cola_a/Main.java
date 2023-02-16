package ejercicios.ej_cola_a;

public class Main {
     public static void main(String[] args) throws InterruptedException {

          //Checkpoint para medir el tiempo de ejecucion
          long inicio = System.currentTimeMillis();

          ColaArreglo<Integer> q = new ColaArreglo<Integer>(Integer.class);

          // deQueue is not possible on empty queue
          q.deQueue();

          // enQueue 5 elements
          q.enQueue(24);
          q.enQueue(24);
          q.enQueue(24);
          q.enQueue(24);
          q.enQueue(24);

          // 6th element can't be added to because the queue is full
         q.enQueue(24);

          q.imprime();

          // deQueue removes element entered first i.e. 1
          q.deQueue();

          // Now we have just 4 elements
          q.imprime();

          long fin = System.currentTimeMillis();
          double tiempo = (double) ((fin - inicio)/1000);
          System.out.println(tiempo +" segundos");
    }
}
