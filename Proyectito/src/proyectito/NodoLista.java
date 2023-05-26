/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;

/**
 *
 * @author Carlol
 */
public class NodoLista {
    private int id;

    private NodoLista next;
    
    public NodoLista(int id) {
        this.id = id;
        this.next = null;
    }

    public int getId() {
        return id;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

        
}
