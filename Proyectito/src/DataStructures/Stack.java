/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Miguel
 */
public class Stack {

    private Nodo peek;
    private int length;

    public Stack() {
        this.peek = null;
        this.length = 0;
    }

    public Nodo getPeek() {
        return peek;
    }

    public void setPeek(Nodo peek) {
        this.peek = peek;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isEmpty() {
        return getPeek() == null;
    }

    public void push(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setPeek(nodo);
        } else {
            nodo.setNext(getPeek());
            setPeek(nodo);
        }
        length++;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            Nodo pointer = getPeek();
            setPeek(pointer.getNext());
            pointer.setNext(null);
            length--;
        }
    }

    public void print() {
        Nodo pointer = getPeek();

        while (pointer != null) {
            System.out.println(pointer.getElement());
            pointer = pointer.getNext();
        }
    }
}
