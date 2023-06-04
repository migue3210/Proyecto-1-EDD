/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectito;

import Interfaz.Bienvenido20;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static Interfaz.Bienvenido20.grafito;
import java.util.Iterator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author Carlos Marcano
 * @author Miguel Jiménez
 * @author Nicoll Pinzón
 */
public class Main {

    public static void main(String[] args) {
//        TxtManager txt = new TxtManager();
//        Grafo grafo = txt.readText();
//        txt.writeText(grafo);
//        grafo = txt.readText();
        

        Bienvenido20 bn = new Bienvenido20();
        

//        System.out.println("Islas totales: " + grafo.recorridoAmplitud());
//        System.out.println("Islas totales: " + grafo.recorridoProfundidad());
//        
//        grafo.addUser(5, "@OstiaTu");
//        
//        System.out.println("Islas totales: " + grafo.recorridoProfundidad());
//        System.out.println("Islas totales: " + grafo.recorridoAmplitud());
//
//        grafo.bridges(grafo);

        /*
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
         */
    }}

