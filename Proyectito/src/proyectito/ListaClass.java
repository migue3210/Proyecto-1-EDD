/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;

/**
 *
 * @author Carlos Marcano
 */
public class ListaClass {
    
    private String name;
    private int id;
    private int length;
    private NodoLista head;
    
    public ListaClass(int id, String name) {
        this.length = 0;
        this.head = null;
        this.name = name;
        this.id = id;
        
    }
    
    
    
    
    /*
    Declara un nodo como cabeza de la lista
    */
    public void setHead(NodoLista head){
        this.head = head;
    }
    /*
    Devuelve el nodo que este declarado como cabeza
    */
    public NodoLista getHead() {
        return head;
    }
    /*
    Devuelve el ultimo nodo de la lista
    */
    public NodoLista getLast(){
        NodoLista pointer = getHead();
        while (pointer.getNext() != null){
            pointer = (NodoLista) pointer.getNext();
        }
        return pointer;
    }
    /*
    Verifica si la lista esta vacia o no
    */
    public boolean isEmpty(){
        return getHead() == null;
    }/*
    Dado un int "n", devuelve el nodo en la posicion "n" de la lista.
    */
    public NodoLista getIndex(int index){
        NodoLista nodo = getHead();
        if (isEmpty()) {
            System.out.println("Nonexistent index");
            return nodo;
        }else{
            if (index<0 || index > getLength()) {
                System.out.println("Nonexistent index");
                return nodo;
            }else{
                
                int counter = 0;
                while (counter != index){
                    counter++;
                    nodo = (NodoLista) nodo.getNext();

                }    
                return nodo;
            
               
            }
        }    
    }

    /*
    Verifica si un elemento en especifico esta contenido en la lista
    */
    public boolean searchElement(int element){
        if (isEmpty()){
            return false;
        }else{
        NodoLista nodo = getHead();
        for (int i = 0; i < getLength(); i++){
            if (nodo == null){return false;}
            if (nodo.getId() == element){return true;}
            nodo = nodo.getNext();
            }
        
        return false;
        }
    }
    
    /*
    Inserta un elemento al inicio de la lista
    */
    public void insertBegin(int Element, int value){
        NodoLista nodo = new NodoLista(Element);
        nodo.setTime_value(value);
        
        if (isEmpty()){
            setHead(nodo);
            
        }else{
            nodo.setNext(getHead());
            setHead(nodo);
            
        }
        length++;
    }
    /*
    Elimina el primer elemento de la lista
    */  
    public void deleteBegin(){
        if (isEmpty()){
            System.out.println("The list is empty");
        }else{
            NodoLista pointer = getHead();
            setHead((NodoLista) pointer.getNext());
            pointer.setNext(null);
            
        }
        length--;
    }
    /*
    Inserta un nodo al final de la lista
    */
    public void insertEnd(int Element, int value){
        NodoLista nodo = new NodoLista(Element);
        nodo.setTime_value(value);
        
        if (isEmpty()){
            setHead(nodo);
            
        }else{
            NodoLista pointer = getLast();
            pointer.setNext(nodo);
            
            
        }
        length++;
    }
    /*
    Elimina el ultimo nodo de la lista
    */
    public void deleteEnd(){
        if (isEmpty()){
            System.out.println("The list is empty");
        }else{
            NodoLista nodo = getHead();
            while (nodo.getNext() != getLast()){
                nodo = (NodoLista) nodo.getNext();
            }
            nodo.setNext(null);
            
            
        }
        length--;
    }
    /*
    Imprime la lista
    */
    public void printList(){
        NodoLista nodo = getHead();
        while (nodo != null){
            System.out.print(" [" + nodo.getId() + "]");
            nodo = (NodoLista) nodo.getNext();
        }
        
    }
    /*
    Dado un numero entero n, inserta un elemento en la posicion n de la lista.
    */
    public void InsertIndex(int Element, int index){
        NodoLista nodo = new NodoLista(Element);
        
        if (isEmpty()){
            setHead(nodo);
            
        }else{
            if (index==0){
                NodoLista nodohead = getHead();
                setHead(nodo);
                nodo.setNext(nodohead);
            }else{
            NodoLista prenodo = getIndex(index-1);
            NodoLista postnodo = getIndex(index);
            prenodo.setNext(nodo);
            nodo.setNext(postnodo);
            
            }
        }
        length++;
    }
    /*
    Dado un numero entero "n", elimina el elemento numero n de la lista
    */
    public void DeleteIndex(int index) {
        if (isEmpty()) {
            System.out.println("This list is empty");
        }else{if (index==0){
                NodoLista nodohead = getHead();
                setHead((NodoLista) nodohead.getNext());
                nodohead.setNext(null);
        }else{
            NodoLista prenodo = getIndex(index-1);
            NodoLista postnodo = getIndex(index+1);
            NodoLista nodo = getIndex(index);
            nodo.setNext(null);
            prenodo.setNext(postnodo);
        }
        
    }
    }
    /*
    Dado un id, elimina ese elemento de la lista
    */
    public void deleteId(int id){
        
        NodoLista pointer = getHead();
        int index = 0;
        
        while (pointer.getId() != id){
            pointer = pointer.getNext();
            index++;
        }
        DeleteIndex(index);
        length--;
    }
    /*
    Devuelve el valor del nombre del usuario
    */
    public String getName() {
        return name;
    }
    /*
    Devuelve el id del usuario
    */
    public int getId() {
        return id;
    }
    
    /*
    Devuelve la longitud de la lista
    */
    public int getLength() {
        return length;
    }
    
    
    }
