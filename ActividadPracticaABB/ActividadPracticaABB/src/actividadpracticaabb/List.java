/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpracticaabb;


//Interfaz Lista
public interface List<E> { 
  // Quita todos los elementos de la lista para dejarla vacía
  public void limpia();

  // Inserta it en la ubicación actual
  // El cliente debe asegurar que no se excede la capacidad
  public boolean inserta(E it);

  // Anexa "it" al final de la lista
  // El cliente debe asegurar que la capacidad de la lista no se excede
  public boolean insertaFinal(E it);

  // Quita y regresa el elemento actual
  public E elimina();

  // Pon la posición actual al final de la lista
  public void mueveInicio();

  // Pon a posición actual al final de la lista
  public void mueveFinal();

  // Mueve la posición actual un paso a la izquierda, no cambia si ya está al principio
  public void previo();

  // Mueve la posición actual un paso a la derecha, no cambia si ya está al final
  public void siguiente();

  // Regresa el número de elementos de la lista
  public int getTamanio();

  // Regresa la posición del elemento actual
  public int posActual();

  // Pone la posición actual a "pos"
  public boolean mueveAPos(int pos);

  // Regresa verdadero si la posición actual está al final de la lista
  public boolean estaFinal();

  // Regresa el elemento actual
  public E obtener();
}