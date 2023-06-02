/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;


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
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int searchSpace(){
        for (int i = 0; i < getTotalusers(); i++){ 
            if (getUserList()[i] == null){return i;}
        }
        return -1;
    }
    
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
    
    public void expandUserList(){
        
        ListaClass[] UserList2 = new ListaClass[getTotalusers()+1];
        for (int i = 0; i < getTotalusers(); i++){
            UserList2[i] = getUserList()[i];
            
        }       
        setUserList(UserList2);
        setTotalusers(getTotalusers() + 1);
    }
    
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

           
       }
    }
    
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
    
    
    public void emptyGrafo(){
        ListaClass[] EmptyUserList = new ListaClass[0];
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
    
}
