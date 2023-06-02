/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Miguel
 */
public class Queue {

    private Nodo head;
    private Nodo tail;
    private int length;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isEmpty() {
        return getHead() == null;
    }

    public void enqueue(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            Nodo pointer = getTail();
            pointer.setNext(nodo);
            setTail(nodo);
        }
        length++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null) {
                setTail(null);
            }
            length--;
        }
    }

    public Nodo dispatch() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null) {
                setTail(null);
            }
            length--;
            return pointer;
        }
        return null;
    }

    public void print() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.println(pointer.getElement());
            pointer = pointer.getNext();
        }
    }

}
