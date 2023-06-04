/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;
import DataStructures.Queue;
import DataStructures.Nodo;
/**
 * @author Carlos Marcano
 */

public class Grafo {

    private int totalusers;
    private ListaClass[] UserList;
    private int size;



    public Grafo(int Totalusers) {
        this.totalusers = Totalusers;
        this.UserList = new ListaClass[Totalusers];
        this.size = 0;
    }
    /*
    Chequea si el grafo esta vacio
    */
    public boolean isEmpty(){
        return size == 0;
    }
    /*
    Devuelve el espacio del array que este vacio
    */
    public int searchSpace(){
        for (int i = 0; i < getTotalusers(); i++){ 
            if (getUserList()[i] == null){return i;}
        }
        return -1;
    }
    /*
    Devuelve el espacio del array de un Id en especifico
    */
    public int searchUser(int userId){
        if (getSize() == 0){
            return -1;
        }else{
            for (int i = 0; i < getTotalusers(); i++){
                if (getUserList()[i] != null){
                    if (getUserList()[i].getId() == userId){return i;}    
                }
            }
            return -1;
        }
    }
    /*
    Aumenta la capacidad del array en 1
    */
    public void expandUserList(){
        
        ListaClass[] UserList2 = new ListaClass[getTotalusers()+1];
        for (int i = 0; i < getTotalusers(); i++){
            UserList2[i] = getUserList()[i];
            
        }       
        setUserList(UserList2);
        setTotalusers(getTotalusers() + 1);
    }
    /*
    Agrega un usuario nuevo al grafo
    */
    public void addUser(int id, String username){
        ListaClass user = new ListaClass(id, username);
        
        if (searchUser(id) == -1){
            int emptyslot = searchSpace();
            if (emptyslot == -1){
                expandUserList();
                getUserList()[searchSpace()] = user;
            }else{
                getUserList()[emptyslot] = user;
            }
            setSize(getSize() + 1);
        }else{
            System.out.println("Entrada erronea, el usuario con id " + id + " ya existe en la base de datos");
        }
    }
    /*
    Dado un id, elimina un usuario en especifico del grafo
    */
    public void deleteUser(int id){
       if (searchUser(id) == -1){
           System.out.println("Entrada Erronea, no puedes eliminar al usuario con id: " + id + " por que no existe en la base de datos");
       }else{
           ListaClass user = UserList[searchUser(id)];

           int userlength = user.getLength();
           for (int i = 0; i < userlength; i++){
               NodoLista nodo = user.getHead();
               deleteConnection(id, nodo.getId());
           }
           UserList[searchUser(id)] = null;

          size--; 
       }
       
    }
    /*
    Crea la conexion entre dos usuarios con su valor de duracion de amistad
    */
    public void addConnection (int IdUser, int IdConnection, int years_value) {
        if (IdUser == IdConnection){
            System.out.println("Entrada erronea, no puedes conectar a un usuario consigo mismo");
        }else{
            if (years_value <0){
                System.out.println("Entrada erronea, la conexión de dos usuarios no puede ser menor a 0");
            }else{
        if (searchUser(IdUser) != -1 && searchUser(IdConnection) != -1){
            if (    getUserList()[searchUser(IdUser)].searchElement(IdConnection)){
                System.out.println("Entrada erronea, el id " + IdUser + " y el id " + IdConnection + " ya estan conectados.");
            }else{
                        getUserList()[searchUser(IdUser)].insertEnd(IdConnection, years_value);
                        getUserList()[searchUser(IdConnection)].insertEnd(IdUser, years_value);
            }

        }else{System.out.println("Entrada erronea, el id " + IdUser + " o el id " + IdConnection + " no existen en la base de datos actual.");}
        }
        }
    }
    /*
    Dados dos usuarios, elimina la conexion entre ellos
    */
    public void deleteConnection (int IdUser, int IdConnection) {
        
    if (searchUser(IdUser) != -1 && searchUser(IdConnection) != -1){
        
        if (!UserList[searchUser(IdUser)].searchElement(IdConnection)){
            System.out.println("Entrada erronea, el id " + IdUser + " y el id " + IdConnection + " no estan conectados.");
        }else{
                getUserList()[searchUser(IdUser)].deleteId(IdConnection);
                getUserList()[searchUser(IdConnection)].deleteId(IdUser);
        }
        
    }else{System.out.println("Entrada erronea, el id " + IdUser + " o el id " + IdConnection + " no existen en la base de datos actual.");}
    }
    
    /*
    Vacia el grafo completamente, dejando un (1) espacio vacio en el array
    */
    public void emptyGrafo(){
        ListaClass[] EmptyUserList = new ListaClass[1];
        setUserList(EmptyUserList);
        setTotalusers(1);
        setSize(0);
        
    }
    
    //Solo para ser usado en pruebas
    public void printGrafo() { 
        if (isEmpty()){
            System.out.println("El grafo esta vacío");
        }else{
        for (int i = 0; i < getTotalusers(); i++){
            if(getUserList()[i] != null){
                System.out.println("User: " + getUserList()[i].getName() + " [" + getUserList()[i].getId() + "]");

                System.out.print("Connections:");
                getUserList()[i].printList();
                System.out.println("");
            }
        }
    }
    }

    public int getTotalusers() {
        return totalusers;
    }

    public void setTotalusers(int totalusers) {
        this.totalusers = totalusers;
    }

    public ListaClass[] getUserList() {
        return UserList;
    }

    public void setUserList(ListaClass[] UserList) {
        this.UserList = UserList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    /*
    Recorre todos los nodos del grafo, por cada vertice donde se detiene agrega 
    sus conexiones a una cola, cada vez que la cola queda vacia se cuenta
    como una isla y se busca otro vertice no visitado. Se finaliza el proceso al
    haber visitado todos los vertices del grafo.
    */
    public void recorridoAmplitud(){
        ListaClass visited = new ListaClass(-1,"VISITED");
        Queue cola = new Queue();
        int islas = 0;
        int pointer = 0;
        
        while (visited.getLength() != getSize()){
            for (int i = 0; i < getSize(); i++){
                pointer = UserList[i].getId();
                if (!visited.searchElement(UserList[i].getId())){
                    break;
                }
            }

            cola.enqueue(pointer);
            
            while (!cola.isEmpty()){
                Nodo HeadNode = cola.getHead();
                int Id = (int) HeadNode.getElement();

                for (int i = 0; i < UserList[searchUser(Id)].getLength(); i++){
                    int temp = UserList[searchUser(Id)].getIndex(i).getId();
                    if (!visited.searchElement(temp) && !cola.searchElement(temp)){
                        cola.enqueue(temp);
                    }
                }
                visited.insertBegin(Id, -1);
                cola.dequeue();
            }
            
            islas++;
        }
        System.out.println("Islas totales: "+ islas);

    }
    
    
}
