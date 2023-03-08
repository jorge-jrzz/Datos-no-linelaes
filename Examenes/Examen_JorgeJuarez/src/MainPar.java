public class MainPar {
    public static void main(String[] args) {
        Par<Integer, String> p1 = new Par<Integer, String>(7, "hola");
        Par<Integer, String> p2 = new Par<Integer, String>(5, "dos");

        System.out.println();
        System.out.println(p1);
        System.out.println("----------------------");
        System.out.println(p2);
    }
    
}
