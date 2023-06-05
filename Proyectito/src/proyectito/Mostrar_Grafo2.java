/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

import DataStructures.NodoLista;
import Interfaz.Bienvenido20;
import static Interfaz.Bienvenido20.grafito;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JOptionPane;
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

    public Mostrar_Grafo2(Grafo grafito, Graph graph) {

        graph.setAttribute("ui.stylesheet", styleSheet);
        graph.setAutoCreate(true);
        graph.setStrict(false);

        Viewer viewer = graph.display();

viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
       
        
        int id = 0;
       
        for (int i = 0; i < grafito.getTotalusers(); i++) {
            if (grafito.getUserList()[i] != null){
            NodoLista nodo = grafito.getUserList()[i].getHead();
            
            while (nodo != null  ) {
                try {
                    graph.addEdge(Integer.toString(id), Integer.toString(grafito.getUserList()[i].getId()), Integer.toString(nodo.getId()));
                    
                    graph.getEdge(Integer.toString(id)).setAttribute("ui.style", "text-size: 30px;");
                    graph.getEdge(Integer.toString(id)).setAttribute("ui.label", Integer.toString(nodo.getTime_value()));
                    

                } catch (Exception e) {
                    graph.addEdge(Integer.toString(id), Integer.toString(grafito.getUserList()[i].getId()), Integer.toString(nodo.getId()));
                }
                    id++;
                    nodo = (NodoLista) nodo.getNext();
            }
        }
            }
           id = 0;
            for (Node node : graph) {

                node.setAttribute("ui.label", node.getId());
                node.setAttribute("ui.style", "text-size: 30px;");
                node.setAttribute("ui.style", "size: 30px;");
                

            }

    }
    protected String styleSheet
            = "node {"
            + "	fill-color: cyan;"
            + "}";
   
    

}
