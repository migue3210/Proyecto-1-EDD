/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectito;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Marcano
 * @author Miguel Jiménez
 * @author Nicoll Pinzón
 */
public class Main {

    public static void main(String[] args) {
        Grafo grafo = new Grafo(1);
        Grafo grafo2 = new Grafo(1);
        TxtManager txt = new TxtManager();
        txt.readText(grafo);

        while (true) {
            String menu = JOptionPane.showInputDialog("1. Agregar Usuario\n2. Abrir otro txt\n3. Salir");
            if ("1".equals(menu)) {
                String name = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
                String id = JOptionPane.showInputDialog("Ingrese un id numérico: ");
                grafo.addUser(Integer.parseInt(id), name);
                grafo.printGrafo();
            } else if ("2".equals(menu)) {
                txt.writeText("test//users_1.txt", grafo);
//                txt.readText(grafo2);
            } else if ("3".equals(menu)) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un valor en el rango");
            }
        }
    }
}
