import java.util.*;

public class HeapMax {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese el tamaño del montículo: ");
            int n = input.nextInt();

            int[] heap = new int[n];

            System.out.println("Ingrese los elementos del montículo: ");

            for (int i = 0; i < n; i++) {
                heap[i] = input.nextInt();
            }

            System.out.println("El montículo ingresado es: ");
            imprimirMonticulo(heap, n);
        } catch (Exception e) {
            System.out.println("Error en la recopilacion de datos");
        }
    }

    public static void imprimirMonticulo(int[] heap, int n) {
        int nivel = 0;
        int cantidad = 1;
        int indice = 0;

        while (indice < n) {
            System.out.print("Nivel " + nivel + ": ");

            for (int i = 0; i < cantidad && indice < n; i++) {
                System.out.print(heap[indice] + " ");
                indice++;
            }

            System.out.println();
            nivel++;
            cantidad *= 2;
        }
    }
}
