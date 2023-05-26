/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;

/**
 *
 * @author Carlol
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
    
    
    
    
    
    public void setHead(NodoLista head){
        this.head = head;
    }
    public NodoLista getHead() {
        return head;
    }
    public NodoLista getLast(){
        NodoLista pointer = getHead();
        while (pointer.getNext() != null){
            pointer = (NodoLista) pointer.getNext();
        }
        return pointer;
    }
    
    public boolean isEmpty(){
        return getHead() == null;
    }
    public NodoLista getIndex(int index){
        NodoLista nodo = getHead();
        if (isEmpty()) {
            System.out.println("Nonexistent index");
            return nodo;
        }else{
            if (index<0 || index > length) {
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

    
    public boolean searchElement(int element){
        NodoLista nodo = getHead();
        for (int i = 0; i < length; i++){
            if (nodo == null){return false;}
            if (nodo.getId() == element){return true;}
            nodo = nodo.getNext();
            }
        
        return false;
        }
    
    
    public void insertBegin(int Element){
        NodoLista nodo = new NodoLista(Element);
        
        if (isEmpty()){
            setHead(nodo);
            
        }else{
            nodo.setNext(getHead());
            setHead(nodo);
            
        }
        length++;
    }
        
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
    
    public void insertEnd(int Element){
        NodoLista nodo = new NodoLista(Element);
        
        if (isEmpty()){
            setHead(nodo);
            
        }else{
            NodoLista pointer = getLast();
            pointer.setNext(nodo);
            
            
        }
        length++;
    }
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
    
    public void printList(){
        NodoLista nodo = getHead();
        while (nodo != null){
            System.out.print(" [" + nodo.getId() + "]");
            nodo = (NodoLista) nodo.getNext();
        }
    }
    
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
    
    public void DeleteId(int id){
        
        NodoLista pointer = getHead();
        int index = 0;
        
        while (pointer.getId() != id){
            pointer = pointer.getNext();
            index++;
        }
        DeleteIndex(index);
        
    }
    
    }
