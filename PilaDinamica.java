public class PilaDinamica<T> {
    private Nodo<T> top;
    private int size = 0;

    public void push(T datos) {
        Nodo<T> aux;
        if(isEmpty()) {
            aux = new Nodo<T>(datos, null, null);
        }
        else {
            aux = new Nodo<T>(datos, null, top);
            top.setPrev(aux);
        }
        top = aux;
        size++;
    }

    public void pop() {
        if(!isEmpty()) {
            if(size == 1) {
                top = null;
            }
            else {
                Nodo<T> aux = top;
                top = top.getNext();
                top.setPrev(null);
                aux.despegar();
                aux = null;
            }
            size--;
        }
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void clear() {
        while(!isEmpty()) {
            pop();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Nodo<T> aux = top;
        while (aux != null) {
            sb.append(aux.getData());
            if (aux.getNext() != null) {
                sb.append(", ");
            }
            aux = aux.getNext();  
        }
        sb.append(" ]");
        return sb.toString();
    }
}
