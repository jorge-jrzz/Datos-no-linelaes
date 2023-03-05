/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpracticaabb;


class NodoLista<E> {         // Nodo Clase simplemte ligada
  private E elemento;          // Valor para este nodo
  private NodoLista<E> siguiente;    // Apunta al siguiente nodo en la lista

  // Constructores
  NodoLista(E it, NodoLista<E> inn) { elemento = it; siguiente = inn; }
  NodoLista(NodoLista<E> inn) { elemento = null; siguiente = inn; }

  E getElemento() { return elemento; }                        // Regresa el valor
  E setElemento(E it) { return elemento = it; }            // Pone el valor
  NodoLista<E> getSiguiente() { return siguiente; }                     // Regresa el siguiente vínculo
  NodoLista<E> setSiguiente(NodoLista<E> inn) { return siguiente = inn; } // Pone el siguiente link
}