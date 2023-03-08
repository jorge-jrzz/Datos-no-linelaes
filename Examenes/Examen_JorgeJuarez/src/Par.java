public class Par <T, E>{
    private T datoT;
    private E datoE;

    public T getDatoT() {
        return datoT;
    }
    public void setDatoT(T datoT) {
        this.datoT = datoT;
    }
    public E getDatoE() {
        return datoE;
    }
    public void setDatoE(E datoE) {
        this.datoE = datoE;
    }

    public Par(T datoT, E datoE) {
        this.datoT = datoT;
        this.datoE = datoE;
    }

    /*
    public void print(T datoT, E datoE) {
        System.out.println("Dato tipo int: " + this.datoT);
        System.out.println("Dato tipo string: " + this.datoE);
    }
    */

    @Override
    public String toString() {
        return "Dato tipo int: " + this.datoT + "\nDato tipo string: " + this.datoE;
    }
}
