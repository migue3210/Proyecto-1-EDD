/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

import static Interfaz.Bienvenido20.grafito;
import java.util.Arrays;
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
public class Mostrar_Grafo2 {
    

    

    public Mostrar_Grafo2(Grafo grafito) {
        Graph graph = new SingleGraph("proyecto");

        graph.setAttribute("ui.stylesheet", styleSheet);
        graph.setAutoCreate(true);
        graph.setStrict(false);
        graph.display();
        grafito.printGrafo();
        int id = 0;
            for (int i = 0; i < grafito.getTotalusers(); i++) {
            if(grafito.getUserList()[i] != null){
                NodoLista nodo = grafito.getUserList()[i].getHead();
            
           String[] punto = grafito.getUserList()[i].optdestino();
            int npb = 0;
            int id2=0;
            while (nodo != null) {
                
                    try{
                if (Integer.parseInt(punto[npb])!=nodo.getId()){
                        System.out.println(punto[id2] +" iop\npoe "+ nodo.getId());
                    graph.addEdge(Integer.toString(id), Integer.toString(nodo.getId()),punto[id2]);
//                    graph.getEdge(Integer.toString(id)).setAttribute("ui.label", Integer.toString(nodo.getTime_value()));
                    graph.getEdge(Integer.toString(id)).setAttribute("ui.style", "text-size: 30px;");
                    System.out.println("si paso " +graph.getEdge(Integer.toString(id)));
                    id++;
                    id2++;
                }
                    }catch (Exception e){
                      graph.addEdge(Integer.toString(id),punto[id2],Integer.toString(nodo.getId()));
                       
                       id++;
                       id2++;
                        System.out.println(e +"     no paso");
                    }
                     
                    
                nodo = (NodoLista) nodo.getNext();
              }
            }
            }
                    id = 0;
                    for (Node node : graph) {

                        node.setAttribute("ui.label", node.getId());
                        node.setAttribute("ui.style", "text-size: 30px;");
                        node.setAttribute("ui.style", "size: 30px;");
                        id++;

                    }

                    
//                        explore(graph.getNode(Integer.toString(grafito.getUserList()[0].getId())));
//            
//   
//    
//}
////} 
////    catch(Exception e){
////    }
////    }
//
//        
//
//                
//
//    
//
//    
//
//    
//
//    public void explore(Node source) {
//        Iterator<? extends Node> k = source.getBreadthFirstIterator();
//
//        while (k.hasNext()) {
//            Node next = k.next();
//            next.setAttribute("ui.class", "marked");
//            sleep();
//        }
//    }

//    protected void sleep() {
//        try {
//            Thread.sleep(15);
//        } catch (Exception e) {
        
//
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