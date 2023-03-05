/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpracticaabb;



class Llist<E> implements List<E> {
  private NodoLista<E> cabeza; // Apuntador a la cabeza de la lista
  private NodoLista<E> cola; // Apuntador al último nodo
  private NodoLista<E> curr; // Elemento actual
  private int tamanio; // Tamaño de la lista

  /**
   * Constructor para coincidir con la interfaz lista, el tamaño se ignora
   */
  Llist(int size) {
    this();
  }

  /**
   * Crea una lista vacía
   */
  Llist() {
    limpia();
  }

  /**
   * Quita todos los elementos
   */
  public void limpia() {
    curr = cola = new NodoLista<E>(null); //Crea nodo ultimo
    cabeza = new NodoLista<E>(cola); // Crea nodo cabeza
    tamanio = 0;
  }

  /**
   * Inserta "it" en la posición actual
   */
  public boolean inserta(E it) {
    curr.setSiguiente(new NodoLista<E>(curr.getElemento(), curr.getSiguiente()));
    curr.setElemento(it);
    if (cola == curr)
      cola = curr.getSiguiente(); // New tail
    tamanio++;
    return true;
  }

  /**
   * Agrega al final de la lista "it"
   */
  public boolean insertaFinal(E it) {
    cola.setSiguiente(new NodoLista<E>(null));
    cola.setElemento(it);
    cola = cola.getSiguiente();
    tamanio++;
    return true;
  }

  /**
   * Quitar y regresar el elemento actual
   */
  public E elimina() {
    if (curr == cola)
      return null; // Nothing to remove
    E it = curr.getElemento(); // Remember value
    curr.setElemento(curr.getSiguiente().getElemento()); // Pull forward the next element
    if (curr.getSiguiente() == cola)
      cola = curr; // Removed last, move tail
    curr.setSiguiente(curr.getSiguiente().getSiguiente()); // Point around unneeded link
    tamanio--; // Decrement element count
    return it; // Return value
  }

  /**
   * Poner curr al inicio de la lista
   */
  public void mueveInicio() {
    curr = cabeza.getSiguiente();
  }

  /**
   * Poner curr al final de la lista
   */
  public void mueveFinal() {
    curr = cola;
  }

  /**
   * Mover curr un paso a la izquierda; no hay cambio si está al frente
   */
  public void previo() {
    if (cabeza.getSiguiente() == curr)
      return; // No previous element
    NodoLista<E> temp = cabeza;
    // March down list until we find the previous element
    while (temp.getSiguiente() != curr)
      temp = temp.getSiguiente();
    curr = temp;
  }


  /**
   * Mover curr un paso a la derecha; no hay cambio si está al final
   */
  public void siguiente() {
    if (curr != cola)
      curr = curr.getSiguiente();
  }

  /**
   * Regresa el tamaño de la lista
   */

  public int getTamanio() {
    return tamanio;
  }


  /**
   * Regresa la possición del elemento actual
   */
  public int posActual() {
    NodoLista<E> temp = cabeza.getSiguiente();
    int i;
    for (i = 0; curr != temp; i++)
      temp = temp.getSiguiente();
    return i;
  }

  /**
   * Mueve la lista a la posición pos
   */
  public boolean mueveAPos(int pos) {
    if ((pos < 0) || (pos > tamanio))
      return false;
    curr = cabeza.getSiguiente();
    for (int i = 0; i < pos; i++)
      curr = curr.getSiguiente();
    return true;
  }


  /**
   * Regresa verdadero si está al finial de la posición de la liista
   */
  public boolean estaFinal() {
    return curr == cola;
  }


  /**
   * Regresa el valor del elemento actual. Si curr está en la cola, se regresa null
   */
  public E obtener() {
    return curr.getElemento();
  }
}