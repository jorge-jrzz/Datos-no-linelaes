public class Pila<T> {
    private Nodo<T> cima;
    private int tam = 0;

    public void push(T datos) {
        Nodo<T> aux;
        if(estaVacia()) {
            aux = new Nodo<T>(datos);
        }
        else {
            aux = new Nodo<T>(datos, null, cima);
            cima.setAnt(aux);
        }
        cima = aux;
        tam++;
    }

    public void pop() {
        if(estaVacia()) {
            if(tam == 1) {
                cima = null;
            }
            else {
                Nodo<T> aux = cima;
                cima = cima.getSig();
                cima.setAnt(null);
                aux.despegar();
                aux = null;
            }
        }
    }

    
    

    public boolean estaVacia() {
        return this.tam == 0;
    }
}
