public class Nodo<T> {
    private T datos;
    private Nodo<T> ant;
    private Nodo<T> sig;

    Nodo(){}

    Nodo(T datos) {
        this.datos = datos;
        this.ant = null;
        this.sig = null;
    }

    Nodo(T datos, Nodo<T> ant, Nodo<T> sig) {
        this.datos = datos;
        this.ant = ant;
        this.sig = sig;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    public void setAnt(Nodo<T> ant) {
        this.ant = ant;
    }

    public T getDatos() {
        return this.datos;
    }

    public Nodo<T> getAnt() {
        return this.ant;
    }

    public Nodo<T> getSig() {
        return this.sig;
    }

    public void despegar() {
        this.sig = null;
        this.ant = null;
    }
}
