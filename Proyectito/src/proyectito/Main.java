/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectito;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Marcano
 * @author Miguel Jiménez
 * @author Nicoll Pinzón
 */
public class Main {

    public static void main(String[] args) {
        TxtManager txt = new TxtManager();
        Grafo grafito = null;

//        grafo.emptyGrafo();
//        grafo.printGrafo();
//        System.out.println(grafo.isEmpty());
//        grafo.addUser(123, "miguelrico");
//        grafo.printGrafo();
        while (true) {
            String menu = JOptionPane.showInputDialog("1. Agregar Usuario\n2. Abrir otro txt\n3. Salir");
            if ("0".equals(menu)) {
                grafito = txt.readText();

            } else if ("1".equals(menu)) {
                String name = JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
                String id = JOptionPane.showInputDialog("Ingrese un id numérico: ");
                grafito.addUser(Integer.parseInt(id), name);
                grafito.printGrafo();
            } else if ("2".equals(menu)) {
                txt.writeText("test//users_1.txt",grafito);
//                txt.readText(grafo2);
            } else if ("3".equals(menu)) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un valor en el rango");
            }
        }

    }
}
