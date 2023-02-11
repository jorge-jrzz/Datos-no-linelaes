//import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*System.out.print("Ingrese un texto: ");
        Scanner sc = new Scanner(System.in);
        String valor = sc.next();
        System.out.println(valor);
        */
        PilaDinamica<Integer> pilaDinamica = new PilaDinamica<Integer>();
        PilaArreglos<Integer> pilaArreglos = new PilaArreglos<Integer>();
        
        pilaDinamica.push(0);
        pilaDinamica.push(1);
        pilaDinamica.push(2);
        pilaDinamica.push(3);

        System.out.println(pilaDinamica);

        pilaArreglos.push(0);
        pilaArreglos.push(1);
        pilaArreglos.push(2);
        pilaArreglos.push(3);

        System.out.print(pilaArreglos);
       
    }
}