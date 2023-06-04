/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;

/**
 *
 * @author Carlos Marcano
 */
public class NodoLista {
    private int id;
    private NodoLista next;
    private int time_value;
    
    public NodoLista(int id) {
        this.id = id;
        this.next = null;
        this.time_value = 0;
    }
    /*
    Devuelve el id
    */
    public int getId() {
        return id;
    }
    /*
    Devuelve el elemento al que apunta el nodo
    */
    public NodoLista getNext() {
        return next;
    }

    /*
    Le da un valor de nodo siguiente
    */
    public void setNext(NodoLista next) {
        this.next = next;
    }
    
    /*
    Devuelve el tiempo de amistad del nodo
    */
    public int getTime_value() {
        return time_value;
    }
    /*
    Le da un valor de tiempo de amistad 
    */
    public void setTime_value(int time_value) {
        this.time_value = time_value;
    }

    
    
}
