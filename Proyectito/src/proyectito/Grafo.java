/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;

/**
 * 121, 254, 7 121, 909, 8 254,909,5 909, 893, 5
 *@author Carlos Marcano
 */
public class Grafo {

    int totalusers;
    ListaClass[] UserList;
    int size;

    public Grafo(int Totalusers) {
        this.totalusers = Totalusers;
        this.UserList = new ListaClass[Totalusers];
        this.size = 0;
    }

    public int searchSpace() {
        for (int i = 0; i < totalusers; i++) {
            if (UserList[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int searchUser(int userId) {
        for (int i = 0; i < totalusers; i++) {
            if (UserList[i].getId() == userId) {
                return i;
            }
        }
        return -1;
    }

    public void expandUserList() {

        ListaClass[] UserList2 = new ListaClass[totalusers + 1];
        for (int i = 0; i < totalusers; i++) {
            UserList2[i] = UserList[i];

        }
        UserList = UserList2;
        totalusers++;
    }

    public void addUser(int id, String username) {
        ListaClass user = new ListaClass(id, username);

        int emptyslot = searchSpace();
        if (emptyslot == -1) {
            expandUserList();
            UserList[searchSpace()] = user;
        } else {
            UserList[emptyslot] = user;
        }
        size++;
    }

    public void addConnection(int IdUser, int IdConnection, int years_value) {
        if (searchUser(IdUser) != -1 && searchUser(IdConnection) != -1) {
            if (UserList[searchUser(IdUser)].searchElement(IdConnection)) {
                System.out.println("Entrada erronea, el id " + IdUser + " y el id " + IdConnection + " ya estan conectados.");
            } else {
                UserList[searchUser(IdUser)].insertEnd(IdConnection, years_value);
                UserList[searchUser(IdConnection)].insertEnd(IdUser, years_value);
            }

        } else {
            System.out.println("Entrada erronea, el id " + IdUser + " o el id " + IdConnection + " no existen en la base de datos actual.");
        }
    }

    public void deleteConnection(int IdUser, int IdConnection) {

        if (searchUser(IdUser) != -1 && searchUser(IdConnection) != -1) {

            if (!UserList[searchUser(IdUser)].searchElement(IdConnection)) {
                System.out.println("Entrada erronea, el id " + IdUser + " y el id " + IdConnection + " no estan conectados.");
            } else {
                UserList[searchUser(IdUser)].deleteId(IdConnection);
                UserList[searchUser(IdConnection)].deleteId(IdUser);
            }

        } else {
            System.out.println("Entrada erronea, el id " + IdUser + " o el id " + IdConnection + " no existen en la base de datos actual.");
        }
    }

    //Solo para ser usado en pruebas
    public void printGrafo() {
        for (int i = 0; i < totalusers; i++) {
            System.out.println("User: " + UserList[i].getName() + " [" + UserList[i].getId() + "]");

            System.out.print("Connections:");
            UserList[i].printList();
            System.out.println("");
        }
    }
    
    public String amigoGrafo() {
        String ami = "";
        for (int i = 0; i < totalusers; i++) {
            ami += "User: " + UserList[i].getName() + " [" + Integer.toString(UserList[i].getId()) + "]\n";

            
        }return ami;
    }
}
