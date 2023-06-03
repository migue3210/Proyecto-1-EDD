/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

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
//        graph.display();
        Viewer viewer = graph.display();
// Let the layout work ...
viewer.disableAutoLayout();
// Do some work ...
viewer.enableAutoLayout();
viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.HIDE_ONLY);
        int i = 0;
        for (Node node : graph) {
            System.out.println(graph.getNode(i) + "     qupiotruweortuewioyrtieyrtoew");
            i++;
        }
        int id = 0;
        i = 0;
        for (i = 0; i < grafito.getTotalusers(); i++) {
            NodoLista nodo = grafito.getUserList()[i].getHead();
            while (nodo != null) {
                try {
                    System.out.println("DONATAAAAA" + "");
                    graph.addEdge(Integer.toString(id), Integer.toString(grafito.getUserList()[i].getId()), Integer.toString(nodo.getId()));
                    System.out.println(grafito.getUserList()[i].getId() + "LECHEEEEE" + nodo.getId());
                    graph.getEdge(Integer.toString(id)).setAttribute("ui.style", "text-size: 30px;");
                    graph.getEdge(Integer.toString(id)).setAttribute("ui.label", Integer.toString(nodo.getTime_value()));
                    

                } catch (Exception e) {
                    graph.addEdge(Integer.toString(id), Integer.toString(grafito.getUserList()[i].getId()), Integer.toString(nodo.getId()));
                }
                    id++;
                    nodo = (NodoLista) nodo.getNext();
            }

            }
           id = 0;
            for (Node node : graph) {

                node.setAttribute("ui.label", node.getId());
                node.setAttribute("ui.style", "text-size: 30px;");
                node.setAttribute("ui.style", "size: 30px;");
                id++;

            }
//JOptionPane.showMessageDialog(null, "lo que paso paso, entre tu y yooooo");
////         
////        graph.setAutoCreate(false);
////        graph.setStrict(true);
////         graph.display().close();
////viewer.removeView(this);
//
//try{
//    viewer.close();
//}catch(Exception e){
//    System.out.println("AHHHHHHHH");
//    Bienvenido20 bn = new Bienvenido20();
//}


    }
    protected String styleSheet
            = "node {"
            + "	fill-color: cyan;"
            + "}";
   
    

}
