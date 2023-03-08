public class Nodo<T> {
    private T valor;
    private Nodo<T> right, left;

    public Nodo(T valor) {
        this.valor = valor;
        this.right = null;
        this.left = null;
    }

    public T getValor() {
        return this.valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getRight() {
        return this.right;
    }

    public void setRight(Nodo<T> right) {
        this.right = right;
    }

    public Nodo<T> getLeft() {
        return this.left;
    }

    public void setLeft(Nodo<T> left) {
        this.left = left;
    }
}
