package ej_cola_a;

public class Main {
    public static void main(String[] args) {
        ColaArreglo<Integer> q = new ColaArreglo<Integer>();

   // deQueue is not possible on empty queue
        q.deQueue();

   // enQueue 5 elements
        q.enQueue(21);
        q.enQueue(21);
        q.enQueue(21);
        q.enQueue(21);
        q.enQueue(21);

   // 6th element can't be added to because the queue is full
        q.enQueue(21);

        q.imprime();

   // deQueue removes element entered first i.e. 1
        q.deQueue();

   // Now we have just 4 elements
        q.imprime();
    }
}
