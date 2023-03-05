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

// Implementación de un nodo de arbol binario soporta Objetos Comparables
class NodoABB<E extends Comparable<? super E>> {
  private E elemento;           // Elmento
  private NodoABB<E> izq;     // Apuntador hijo izquierdo
  private NodoABB<E> der;    // Apuntador hijo derecho

  // Constructores
  NodoABB() {izq = der = null; }
  NodoABB(E val) {
      izq = der = null; elemento = val;
  }
  NodoABB(E val, NodoABB<E> l, NodoABB<E> r)
    { izq = l; der = r; elemento = val; }

  // Getter y setter elemento
  public E element() { return elemento; }
  public void setElemento(E v) { elemento = v; }
  public E getElemento() {
    return this.elemento;
  }

  // Getter y setter izq
  public NodoABB<E> getIzq() { return izq; }
  public void setIzq(NodoABB<E> p) { izq = p; }

  // Getter y setter der
  public NodoABB<E> getDer() { return der; }
  public void setDer(NodoABB<E> p) { der = p; }

  // nodo hoja
  public boolean esHoja() { return (izq == null) && (der == null); }
}
