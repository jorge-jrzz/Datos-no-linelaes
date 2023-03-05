/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpracticaabb;

/**
 *
 * @author Alejandro
 */

// Implementación de árbol binario de búsqueda incompleto
class ABB<T extends Comparable<T>> {
    protected NodoABB<T> raiz; // Raíz del ABB
    protected int cuentaNodos; // Número de nodos en ABB

    // Constructor
    ABB() {
        raiz = null;
        cuentaNodos = 0;
    }

    //Reinicializar árbol
    public void clear() {
        raiz = null;
        cuentaNodos = 0;
    }

    // Insertar un registro al árbol
    // Puede ser cualquier tipo de datos, pero deben implementar la Interfaz Comparable
    // e: Elemento a inisertar
    public void insert(T e) {
        raiz = insertaAux(raiz, e);
        cuentaNodos++;
    }

    private NodoABB<T> insertaAux(NodoABB<T> rt, T e) {
        if (rt == null)
            return new NodoABB<T>(e);
        if (rt.element().compareTo(e) >= 0)
            rt.setIzq(insertaAux(rt.getIzq(), e));
        else
            rt.setDer(insertaAux(rt.getDer(), e));
        return rt;
    }


    // Regresa el registro con un valor determiniada, null si no existe
    // key: El valor a encontrar
    public T encuentra(T key) {
        return encuentraAux(raiz, key);
    }

    private T encuentraAux(NodoABB<T> rt, T key) {
        if (rt == null)
            return null;
        if (rt.element().compareTo(key) > 0)
            return encuentraAux(rt.getIzq(), key);
        if (rt.element().compareTo(key) == 0)
            return rt.element();
        else
            return encuentraAux(rt.getDer(), key);

    }

    // Regresa el número de nodos
    public int getTamanio() {
        return cuentaNodos;
    }


    // Métodoss por completar**************************

    /**
     * Calcula recursivamente el número de nodos de un árbol binario
     */
    public int tamanioRecursivo() {
        // Necesitas un método auxiliar
        return -1;
    }

    /**
     * Regresa el elemento más pequeño del árbol
     */
    public T minElemento() {
        if (this.raiz != null) {
            return subMinElemento(raiz).getElemento();
        }
        return null;
    }

    private NodoABB<T> subMinElemento(NodoABB<T> aux) {
        if (aux.getIzq() != null) {
            return subMinElemento(aux.getIzq());
        }
        else {
            return aux;
        }
    }
    /**
     * Regrea el elemento más grande del árbol
     */
    public T maxElemento() {
        if (this.raiz != null) {
            return subMaxElemento(raiz).getElemento();
        }
        return null;
    }
    private NodoABB<T> subMaxElemento(NodoABB<T> aux) {
        if (aux.getDer() != null) {
            return subMinElemento(aux.getDer());
        }
        else {
            return aux;
        }
    }
    /**
     * Regresa una lista ordenada que tiene todos los elementos el árbol. Usa Lliist
     */
    public Llist<T> hacerListaOrdenada() {

        return null;
    }

    /**
     * Regresa un verdadero si cumple con las propiedad de un ABB para todos sus nodos
     *
     * Es importante notar que este metodo no sería necesario generalmente, si están bien contruídos los operadores
     *
     */
    public boolean esValido() {
        if (this.raiz != null) {
            return subEsValido(raiz);
        }
        return false;
    }
    private boolean subEsValido(NodoABB<T> aux) {
        T nodoActual = aux.getElemento();
        T hijoIzq;
        T hijoDer;

        if(aux.getIzq() == null && aux.getDer() == null) {
            return true;
        }
        else if(aux.getIzq() == null && aux.getDer() != null) {
            hijoDer = aux.getDer().getElemento();
            return hijoDer.compareTo(nodoActual) > 0 && subEsValido(aux.getDer());
        }
        else if(aux.getIzq() != null && aux.getDer() == null) {
            hijoIzq = aux.getIzq().getElemento();
            return hijoIzq.compareTo(nodoActual) < 0 && subEsValido(aux.getIzq());
        }
        else {
            hijoDer = aux.getDer().getElemento();
            hijoIzq = aux.getIzq().getElemento();
            return hijoIzq.compareTo(hijoDer) < 0 && subEsValido(aux.getIzq()) && subEsValido(aux.getDer());
        }
    }



/*
    private boolean subEsValido(NodoABB<T> aux) {
        if (aux.getIzq() == null) {
            if (aux.getDer() ==  null) {
                return true;
            }
            else {
                if (aux.getDer().getElemento().compareTo(aux.getElemento()) > 0) {
                    return subEsValido(aux.getDer());
                }
                else {return false;}
            }
        }
        else if (aux.getDer() == null) {
            if (aux.getIzq() ==  null) {
                return true;
            }
            else {
                if (aux.getIzq().getElemento().compareTo(aux.getElemento()) < 0) {
                    return subEsValido(aux.getIzq());
                }
                else {return false;}
            }
        }
        else if(aux.getIzq().getElemento().compareTo(aux.getDer().getElemento()) < 0) {
            boolean temp = true;
            temp = subEsValido(aux.getIzq());
            temp = subEsValido(aux.getDer());
            return temp;
        }
        else {return false;}
    }

 */


    //delete a node from BST
    public void borra(T elemento) {
        //Necesita un método auxiliar
    }





}