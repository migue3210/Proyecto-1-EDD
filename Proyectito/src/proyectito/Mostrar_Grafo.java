///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package proyectito;
//
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
//    public  class GraphExplore {
//        public static void main(String args[]) {
//                   System.setProperty("org.graphstream.ui", "swing");
//            Graph graph = new SingleGraph("Tutorial 1");
//            public void printGrafo() {
//        for (int i = 0; i < grafito.getTotalusers(); i++) {
//            System.out.println("User: " + UserList[i].getName() + " [" + UserList[i].getId() + "]");
//
//            System.out.print("Connections:");
//            UserList[i].printList();
//            System.out.println("");
//        }
//    }
//                Object nodo = graph.addNode("A");
//                graph.getNode("A").setAttribute("ui.label", nodo);
//		graph.addNode("B");
//		graph.addNode("C");
//		graph.addEdge("AB", "A", "B");
//		graph.addEdge("BC", "B", "C");
//		graph.addEdge("CA", "C", "A");
//            new GraphExplore();
//        }
//
//        public GraphExplore() {
//            Graph graph = new SingleGraph("tutorial 1");
//           
//            graph.setAttribute("ui.stylesheet", styleSheet);
//            
//// graph.setAttribute("ui.stylesheet", stySheet);
//            graph.setAutoCreate(true);
//            graph.setStrict(false);
//            graph.display();
//
//            graph.addEdge("AB", "A", "B");
//            graph.getEdge("AB").setAttribute("ui.label", "1");
//            graph.getEdge("AB").setAttribute("ui.style", "text-size: 90px;");
//            graph.addEdge("BC", "B", "C");
//            graph.addEdge("CA", "C", "A");
//            graph.addEdge("AD", "A", "D");
//            graph.addEdge("DE", "D", "E");
//            graph.addEdge("DF", "D", "F");
//            graph.addEdge("EF", "E", "F");
//
//            for (Node node : graph) {
//                System.out.println(node.getId());
//                node.setAttribute("ui.label", node.getId());
//                node.setAttribute("ui.style", "text-size: 20px;");
//                node.setAttribute("ui.style", "size: 20px;");
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
//            try { Thread.sleep(10); } catch (Exception e) {}
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
//    }
//    
//}
