public  class Nodo<T> {
    private T data;
    private Nodo<T> prev;
    private Nodo<T> next;
    Nodo(T data, Nodo<T> prev, Nodo<T> next) {
      this.data = data;
      this.prev = prev;
      this.next = next;
    }

    @Override
    public String toString() {
      return data.toString();
    }

    public T getData() {
        return data;
    }

    public void setElemento(T data) {
        this.data = data;
    }

    public Nodo<T> getPrev() {
        return prev;
    }

    public void setPrev(Nodo<T> prev) {
        this.prev = prev;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    public void despegar() {
        this.next = null;
        this.prev = null;
    }
    
}
