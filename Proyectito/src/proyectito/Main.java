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
//        Grafo grafo = new Grafo(1);
//        Grafo grafo2 = new Grafo(1);
//        TxtManager txt = new TxtManager();
//        txt.readText(grafo);
//           
//        
//        grafo.recorridoAmplitud();
//        grafo.addUser(777, "MiguelRico");
//        grafo.recorridoAmplitud();
    Bienvenido20 bn = new Bienvenido20();
        TxtManager txt = new TxtManager();
        
        Grafo grafito = txt.readText();
        
//        System.setProperty("org.graphstream.ui", "swing");
//        System.out.println("SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
//
//        Graph graph = new SingleGraph("Proyecto");
//        graph.clear();
//        int id = 0;
//
//        for (int i = 0; i < grafito.getTotalusers(); i++) {
//            graph.addNode(Integer.toString(grafito.getUserList()[i].getId()));
//            System.out.println(grafito.getUserList()[i].getId());
//        }
////      
//            
//
////        TxtManager txt = new TxtManager();
////         Grafo grafito =txt.readText();
////         Mostrar_Grafo np = new Mostrar_Grafo();
////         np.gafo();
////        Bienvenido20 bn = new Bienvenido20();
////    grafo.addConnection(121, 254, 7);
////        grafo.printGrafo();
////    grafo.deleteConnection(121, 254);
////        System.out.println("--------");
////    grafo.printGrafo();
//System.out.println(grafito);
//         new Mostrar_Grafo2(grafito, graph);
        
    }
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
        
    }

