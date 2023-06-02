///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package proyectito;
//
//import static Interfaz.Bienvenido20.grafito;
//import java.util.Iterator;
//import org.graphstream.graph.Graph;
//import org.graphstream.graph.Node;
//import org.graphstream.graph.implementations.SingleGraph;
//
// import org.graphstream.ui.swing_viewer.ViewPanel;
// import org.graphstream.ui.view.Viewer;
//    import org.graphstream.graph.*;
//    import org.graphstream.graph.implementations.*;
//
///**
// *
// * @author Nicoll Pinzon
// */
//public class Mostrar_Grafo {
//    
//
//    
//        
//            System.setProperty("org.graphstream.ui", "swing");
//            Graph graph = new SingleGraph("Proyecto");
//            
//        for (int i = 0; i < grafito.totalusers; i++) {
//            graph.addNode(Integer.toString(grafito.UserList[i].getId()));
//            
//
//            
//        }
//        for (int i = 0; i < grafito.totalusers; i++) {
//            
//            NodoLista nodo = grafito.UserList[i].getHead();
//            while (nodo != null){
//                
//            graph.addEdge(Integer.toString(nodo.getTime_value()), Integer.toString(grafito.UserList[i].getId()), Integer.toString(nodo.getId()));}
//            nodo = (NodoLista) nodo.getNext();}
//
//            
//        }
//    
//                
//            new Mostrar_Grafo();
//        }
//
//        public Mostrar_Grafo() {
//            Graph graph = new SingleGraph("tutorial 1");
//           
//            graph.setAttribute("ui.stylesheet", styleSheet);
//            
//// graph.setAttribute("ui.stylesheet", stySheet);
//            graph.setAutoCreate(true);
//            graph.setStrict(false);
//            graph.display();
//
//            
//            
//            int np = 0;
//            for (Node node : graph) {
//                System.out.println(node.getId());
//                node.setAttribute("ui.label", node.getId());
//                node.setAttribute("ui.style", "text-size: 20px;");
//                node.setAttribute("ui.style", "size: 20px;");
//                graph.getEdge(np).setAttribute("ui.label", graph.getEdge(np));
//            graph.getEdge(np).setAttribute("ui.style", "text-size: 90px;");
//            np++;
//               
//              
//            }
//            
//            explore(graph.getNode("A"));
//            
//        }
//
//        public void explore(Node source) {
//            Iterator<? extends Node> k = source.getBreadthFirstIterator();
//
//            while (k.hasNext()) {
//                Node next = k.next();
//                next.setAttribute("ui.class", "marked");
//                sleep();
//            }
//        }
//
//        protected void sleep() {
//            try { Thread.sleep(15); } catch (Exception e) {}
//            
//        }
//
//        protected String styleSheet =
//            "node {" +
//            "	fill-color: white;" +
//            "}" +
//            "node.marked {" +
//            "	fill-color: cyan;" +
//            "}";
//        protected String stylSheet =
//            "node {" +
//            "	text-size: 20px;" +
//            "}" +
//            "node.marked {" +
//            "	text-size: 50px;" +
//            "}";
//        protected String stySheet =
//            "node {"+" size: 20px;" + "}"
//                +
//            "node.marked {" +
//            "	text-size: 50px;" +
//            "}";
//    
//    
//}
