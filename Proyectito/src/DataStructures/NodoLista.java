/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Carlol
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

    public int getId() {
        return id;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

    public int getTime_value() {
        return time_value;
    }

    public void setTime_value(int time_value) {
        this.time_value = time_value;
    }

    
}
