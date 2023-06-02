/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectito;

import Interfaz.Bienvenido20;
import static Interfaz.Bienvenido20.grafito;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author Carlos Marcano
 * @author Miguel Jiménez
 * @author Nicoll Pinzón
 */
public class Main {

    public static void main(String[] args) {

        Bienvenido20 bn = new Bienvenido20();
        TxtManager txt = new TxtManager();
        Grafo grafito = txt.readText();
        System.setProperty("org.graphstream.ui", "swing");
        System.out.println("SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");

        Graph graph = new SingleGraph("Proyecto");
        graph.clear();
        int id = 0;

        for (int i = 0; i < grafito.getTotalusers(); i++) {
            graph.addNode(Integer.toString(grafito.getUserList()[i].getId()));
        }
        for (int i = 0; i < grafito.getTotalusers(); i++) {

            NodoLista nodo = grafito.getUserList()[i].getHead();
            while (nodo != null) {
                int npb = 0;
                if (id == 0){
                    graph.addEdge(Integer.toString(id), Integer.toString(grafito.getUserList()[i].getId()), Integer.toString(nodo.getId()));
                    id++;
                }else{
                    Object Node5 = Integer.toString(grafito.getUserList()[i].getId());
                    Object Node7 = Integer.toString(nodo.getId());
                    while (npb < id - 1) {
                        if (graph.getEdge(Integer.toString(npb)).getNode1() == Node5 || graph.getEdge(Integer.toString(npb)).getNode0() == Node7) {
                            if (graph.getEdge(Integer.toString(npb)).getNode0() == Node5 || graph.getEdge(Integer.toString(npb)).getNode1() == Node7) {
                                graph.addEdge(Integer.toString(id), Integer.toString(grafito.getUserList()[i].getId()), Integer.toString(nodo.getId()));
                                id++;
                            }

                        }

                    npb++;

                }}
                nodo = (NodoLista) nodo.getNext();
            }

            

//        TxtManager txt = new TxtManager();
//         Grafo grafito =txt.readText();
//         Mostrar_Grafo np = new Mostrar_Grafo();
//         np.gafo();
//        Bienvenido20 bn = new Bienvenido20();
//    grafo.addConnection(121, 254, 7);
//        grafo.printGrafo();
//    grafo.deleteConnection(121, 254);
//        System.out.println("--------");
//    grafo.printGrafo();
        } new Mostrar_Grafo();
    }
}
