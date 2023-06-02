/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

import static Interfaz.Bienvenido20.grafito;
import java.util.Iterator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author Nicoll Pinzon
 */
public class Mostrar_Grafo {

    public void gafo() {
        System.setProperty("org.graphstream.ui", "swing");
        System.out.println("SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");

        Graph graph = new SingleGraph("Proyecto");
        for (int i = 0; i < grafito.totalusers; i++) {
            graph.addNode(Integer.toString(grafito.UserList[i].getId()));
        }
        for (int i = 0; i < grafito.totalusers; i++) {

            NodoLista nodo = grafito.UserList[i].getHead();
            while (nodo != null) {

                graph.addEdge(Integer.toString(nodo.getTime_value()), Integer.toString(grafito.UserList[i].getId()), Integer.toString(nodo.getId()));
                System.out.println("SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
                nodo = (NodoLista) nodo.getNext();

            }
        }

        new Mostrar_Grafo();
    }

    public Mostrar_Grafo() {
        Graph graph = new SingleGraph("tutorial 1");

        graph.setAttribute("ui.stylesheet", styleSheet);
        graph.setAutoCreate(true);
        graph.setStrict(false);
        graph.display();
        int id = 0;
        int i = 0;
        NodoLista nodo = grafito.UserList[i].getHead();
        while (nodo == null){
            i++;
            nodo = grafito.UserList[i].getHead();}
        while ( i < grafito.totalusers -1 && nodo !=null) {

            nodo = grafito.UserList[i].getHead();
            while (nodo != null) {
                int npb = 0;
                if (id == 0) {
                    graph.addEdge(Integer.toString(id), Integer.toString(grafito.UserList[i].getId()), Integer.toString(nodo.getId()));
                    id++;
                } else {
                    Object Node5 = Integer.toString(grafito.UserList[i].getId());
                    Object Node7 = Integer.toString(nodo.getId());
                    while (npb < id - 1) {
                        if (graph.getEdge(Integer.toString(npb)).getNode1() == Node5 || graph.getEdge(Integer.toString(npb)).getNode0() == Node7) {
                            if (graph.getEdge(Integer.toString(npb)).getNode0() == Node5 || graph.getEdge(Integer.toString(npb)).getNode1() == Node7) {
                                graph.addEdge(Integer.toString(id), Integer.toString(grafito.UserList[i].getId()), Integer.toString(nodo.getId()));
                                id++;
                            }

                        }

                        npb++;

                    }
                }
                nodo = (NodoLista) nodo.getNext();
            }i++;}
            int np = 0;
            while (np < id) {
                
                

                for (int ino = 0; ino < grafito.totalusers; ino++) {
                    
                    nodo = grafito.UserList[ino].getHead();
                    while (nodo != null) {
                    Object Node5 = Integer.toString(grafito.UserList[ino].getId());
                    Object Node7 = Integer.toString(grafito.UserList[ino].getId());
                    if (graph.getEdge(Integer.toString(np)).getNode1() == Node5 || graph.getEdge(Integer.toString(np)).getNode0() == Node7) {
                        if (graph.getEdge(Integer.toString(np)).getNode0() == Node5 || graph.getEdge(Integer.toString(np)).getNode1() == Node7) {
                            graph.getEdge(Integer.toString(np)).setAttribute("ui.label", graph.getEdge(Integer.toString(nodo.getTime_value())));
                            
                            
                            graph.getEdge(Integer.toString(np)).setAttribute("ui.style", "text-size: 90px;");
                        }
                        
                        
                        
                        
                    }nodo = (NodoLista) nodo.getNext();}np++;
                    ino++;}}

                    for (Node node : graph) {
                        System.out.println(node.getId());

                        node.setAttribute("ui.label", node.getId());
                        node.setAttribute("ui.style", "text-size: 20px;");
                        node.setAttribute("ui.style", "size: 20px;");

                    }

                    
                        explore(graph.getNode(Integer.toString(grafito.UserList[0].getId())));
            
    }

                

    

    

    

    public void explore(Node source) {
        Iterator<? extends Node> k = source.getBreadthFirstIterator();

        while (k.hasNext()) {
            Node next = k.next();
            next.setAttribute("ui.class", "marked");
            sleep();
        }
    }

    protected void sleep() {
        try {
            Thread.sleep(15);
        } catch (Exception e) {
        }

    }

    protected String styleSheet
            = "node {"
            + "	fill-color: white;"
            + "}"
            + "node.marked {"
            + "	fill-color: cyan;"
            + "}";
    protected String stylSheet
            = "node {"
            + "	text-size: 20px;"
            + "}"
            + "node.marked {"
            + "	text-size: 50px;"
            + "}";
    protected String stySheet
            = "node {" + " size: 20px;" + "}"
            + "node.marked {"
            + "	text-size: 50px;"
            + "}";

}
