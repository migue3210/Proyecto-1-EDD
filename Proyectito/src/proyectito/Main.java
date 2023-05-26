/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectito;

/**
 *
 *             121, 254, 7
               121, 909, 8
               254,909,5
               909, 893, 5
               *
               * 121, @Pepe_Gónzales
               * 254, @StephaniaCominos
               * 893, @caribu_sol
               * 909, @obiwan123
 * @author Carlol
 */
public class Main {

    public static void main(String[] args) {
        
    Grafo grafo = new Grafo(4);
    
    grafo.addUser(121, "Pepe_Gónzales");
    grafo.addUser(254, "StephaniaCominos");   
    grafo.addUser(893, "caribu_sol");
    grafo.addUser(909, "obiwan123");
    grafo.addUser(69, "papadios69");
     
    grafo.addConnection(121, 254, 7);
    grafo.printGrafo();
    grafo.deleteConnection(121, 254);
        System.out.println("--------");
    grafo.printGrafo();
    
    }   
}
