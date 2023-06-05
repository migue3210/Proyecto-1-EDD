/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;

import DataStructures.NodoLista;
import DataStructures.ListaClass;
import DataStructures.Queue;
import DataStructures.Nodo;
import DataStructures.Stack;
import javax.swing.JOptionPane;

/**
 * @author Carlos Marcano
 * @author Miguel Jimémez
 * @author Nicoll Pinzón
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

    public boolean isEmpty() {
        return size == 0;
    }

    public int searchSpace() {
        for (int i = 0; i < getTotalusers(); i++) {
            if (getUserList()[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int searchUser(int userId) {
        if (getSize() == 0) {
            return -1;
        } else {
            for (int i = 0; i < getTotalusers(); i++) {
                if (getUserList()[i] != null) {
                    if (getUserList()[i].getId() == userId) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }

    public void expandUserList() {

        ListaClass[] UserList2 = new ListaClass[getTotalusers() + 1];
        for (int i = 0; i < getTotalusers(); i++) {
            UserList2[i] = getUserList()[i];

        }
        setUserList(UserList2);
        setTotalusers(getTotalusers() + 1);
    }

    public void addUser(int id, String username) {
        ListaClass user = new ListaClass(id, username);

        if (searchUser(id) == -1) {
            int emptyslot = searchSpace();
            if (emptyslot == -1) {
                expandUserList();
                getUserList()[searchSpace()] = user;
            } else {
                getUserList()[emptyslot] = user;
            }
            setSize(getSize() + 1);
        } else {
            System.out.println("Entrada erronea, el usuario con id " + id + " ya existe en la base de datos");
        }
    }

    public void deleteUser(int id) {
        if (searchUser(id) == -1) {
            System.out.println("Entrada Erronea, no puedes eliminar al usuario con id: " + id + " por que no existe en la base de datos");
        } else {
            ListaClass user = UserList[searchUser(id)];

            int userlength = user.getLength();
            for (int i = 0; i < userlength; i++) {
                NodoLista nodo = user.getHead();
                deleteConnection(id, nodo.getId());
            }
            UserList[searchUser(id)] = null;

            size--;
        }

    }

    public String amigoUser(int id) {
        String name = "";
        for (int i = 0; i < getTotalusers(); i++) {
            if (getUserList()[i] != null) {

                if (getUserList()[i].getId() == id) {
                    name = getUserList()[i].getName();
                }
            }
        }
        return name;
    }

    public void addConnection(int IdUser, int IdConnection, int years_value) {
        if (IdUser == IdConnection) {
            JOptionPane.showMessageDialog(null, "Entrada erronea, no puedes conectar a un usuario consigo mismo");
        } else {
            if (years_value < 0) {
                JOptionPane.showMessageDialog(null, "Entrada erronea, la conexión de dos usuarios no puede ser menor a 0");
            } else {
                if (searchUser(IdUser) != -1 && searchUser(IdConnection) != -1) {
                    if (getUserList()[searchUser(IdUser)].searchElement(IdConnection)) {
                        System.out.println("Entrada erronea, el id " + IdUser + " y el id " + IdConnection + " ya estan conectados.");
                    } else {
                        getUserList()[searchUser(IdUser)].insertBegin(IdConnection, years_value);
                        getUserList()[searchUser(IdConnection)].insertBegin(IdUser, years_value);
                    }

                } else {
                    System.out.println("Entrada erronea, el id " + IdUser + " o el id " + IdConnection + " no existen en la base de datos actual.");
                }
            }
        }
    }

    public boolean alreadyConnected(int IdUser, int IdConnection) {
//     if (IdUser == IdConnection) {
//            
//            JOptionPane.showMessageDialog(null,"Entrada erronea, no puedes conectar a un usuario consigo mismo");
// 
//                        return false;
//                    } else {return true;}
        if (getUserList()[searchUser(IdUser)].searchElement(IdConnection)) {
            JOptionPane.showMessageDialog(null, "Entrada erronea, el id " + IdUser + " y el id " + IdConnection + " ya estan conectados.");
            return false;
        }
        return true;
    }

    public void deleteConnection(int IdUser, int IdConnection) {

        if (searchUser(IdUser) != -1 && searchUser(IdConnection) != -1) {

            if (!UserList[searchUser(IdUser)].searchElement(IdConnection)) {
                System.out.println("Entrada erronea, el id " + IdUser + " y el id " + IdConnection + " no estan conectados.");
            } else {
                getUserList()[searchUser(IdUser)].deleteId(IdConnection);
                getUserList()[searchUser(IdConnection)].deleteId(IdUser);
            }

        } else {
            System.out.println("Entrada erronea, el id " + IdUser + " o el id " + IdConnection + " no existen en la base de datos actual.");
        }
    }

    public void emptyGrafo() {
        ListaClass[] EmptyUserList = new ListaClass[1];
        setUserList(EmptyUserList);
        setTotalusers(1);
        setSize(0);

    }

    public String usuariosExiten() {
        String usuario = "";
        if (isEmpty()) {
            System.out.println("El grafo esta vacío");
        } else {
            for (int i = 0; i < getTotalusers(); i++) {
                if (getUserList()[i] != null) {
                    usuario += "User: " + getUserList()[i].getName() + " [" + getUserList()[i].getId() + "]" + "\n";

                }
            }
        }
        return usuario;
    }

//Solo para ser usado en pruebas
    public void printGrafo() {
        if (isEmpty()) {
            System.out.println("El grafo esta vacío");
        } else {
            for (int i = 0; i < getTotalusers(); i++) {
                if (getUserList()[i] != null) {
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

    public int recorridoAmplitud() {
        ListaClass visited = new ListaClass(-1, "VISITED");
        Queue cola = new Queue();
        int islas = 0;
        int pointer = 0;

        while (visited.getLength() != getSize()) {
            for (int i = 0; i < getSize(); i++) {
                if (UserList[i] != null) {
                    pointer = UserList[i].getId();
                    if (!visited.searchElement(UserList[i].getId())) {
                        break;
                    }
                }
            }

            cola.enqueue(pointer);

            while (!cola.isEmpty()) {
                Nodo HeadNode = cola.getHead();
                int Id = (int) HeadNode.getElement();
//                System.out.println(Id);

                for (int i = 0; i < UserList[searchUser(Id)].getLength(); i++) {
                    int temp = UserList[searchUser(Id)].getIndex(i).getId();
                    if (!visited.searchElement(temp) && !cola.searchElement(temp)) {
                        cola.enqueue(temp);
                    }
                }
                visited.insertBegin(Id, -1);
                cola.dequeue();
            }

            islas++;
        }
//        System.out.println("Islas totales: " + islas);
        return islas;
    }

    public int recorridoProfundidad() {
        ListaClass visited = new ListaClass(-1, "VISITED");
        Stack stack = new Stack();
        int islas = 0;
        int pointer = 0;

        while (visited.getLength() != getSize()) {
            for (int i = 0; i < getSize(); i++) {
                if (UserList[i] != null) {
                    pointer = UserList[i].getId();
                    if (!visited.searchElement(UserList[i].getId())) {
                        break;
                    }
                }
            }

            stack.push(pointer);
            visited.insertBegin(pointer, -1);

            while (!stack.isEmpty()) {
                Nodo peek = stack.getPeek();
                int id = (int) peek.getElement();
//                System.out.println(id);

                stack.pop();
                for (int i = 0; i < UserList[searchUser(id)].getLength(); i++) {
                    int temp = UserList[searchUser(id)].getIndex(i).getId();
                    if (!visited.searchElement(temp)) {
                        visited.insertBegin(temp, -1);
                        stack.push(temp);
                    }
                }
            }
            islas++;
        }
//        System.out.println("Islas totales: " + islas);
        return islas;
    }

    public String bridges(Grafo grafo) {

        ListaClass visited = new ListaClass(-1, "VISITED");
        int islas = grafo.recorridoProfundidad();
        int bridges = 0;
        int pointer;
        String puentes_text = "";

        for (int i = 0; i < getSize(); i++) {
            if (UserList[i] != null) {
                pointer = UserList[i].getId();
                for (int j = 0; j < UserList[searchUser(pointer)].getLength(); j++) {
                    int temp = UserList[searchUser(pointer)].getIndex(j).getId();

                    int years = UserList[searchUser(pointer)].getIndex(j).getTime_value();
                    deleteConnection(pointer, temp);
                    if (islas != recorridoProfundidad() && !visited.searchElement(temp)) {
                        bridges++;
                        System.out.println("Puente: " + pointer + " -> " + temp);
                        puentes_text += "Puente: " + pointer + " -> " + temp + "\n";

                    }
                    addConnection(pointer, temp, years);
                    visited.insertBegin(temp, -1);
                }
            }
        }
        return puentes_text;
    }
}
