/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Jimenez
 */
public class TxtManager {
    private File txtFile;

    public File getTxtFile() {
        return txtFile;
    }

    public void setTxtFile(File f) {
        this.txtFile = f;
    }

    public Grafo readText(Grafo grafo) {
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("./test"));
        file.setDialogTitle("Abre un archivo txt");
        int result = file.showOpenDialog(null);
        File txt = file.getSelectedFile();
        setTxtFile(txt);

        String line;
        String users_txt = "";
        BufferedReader lector;

        try {
            if (result == JFileChooser.APPROVE_OPTION) {
                if (!grafo.isEmpty()) {
                    grafo.emptyGrafo();
                }
                lector = new BufferedReader(new FileReader(txt));
                while ((line = lector.readLine()) != null) {
                    if (!line.isEmpty()) {
                        users_txt += line + "\n";
                    }
                }
                if (!"".equals(users_txt)) {
                    String[] fsplit = users_txt.split("Relaciones\n");
                    String[] users_split = fsplit[0].split("\n");
                    for (int i = 0; i < users_split.length; i++) {
                        String[] user = users_split[i].split("(,|, )");
                        if (!users_split[i].equals("Usuarios")) {
                            grafo.addUser(Integer.parseInt(user[0]), user[1]);
                        }
                    }
                    String[] connections_split = fsplit[1].split("\n");
                    for (int i = 0; i < connections_split.length; i++) {
                        String[] conection = connections_split[i].split("(, |,)");
                        grafo.addConnection(Integer.parseInt(conection[0]), Integer.parseInt(conection[1]), Integer.parseInt(conection[2]));
                    }
//                    grafo.printGrafo();
//                    System.out.println("");
//                    System.out.println("");
//                    System.out.println("");
                }
                lector.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún documento txt");
            }

        } catch (Exception err) {
            System.out.println(err);
            JOptionPane.showMessageDialog(null, "error al momento de leer los usuarios y sus relaciones.");
        }
        return grafo;
    }

    public void writeText(String nombreArchivo, Grafo grafo) {
        try {
            FileWriter w = new FileWriter(getTxtFile());
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.append("Usuarios\n");
            for (int i = 0; i < grafo.getTotalusers(); i++) {
                wr.append(grafo.getUserList()[i].getId() + ", " + grafo.getUserList()[i].getName() + "\n");
            }
            wr.append("Relaciones\n");
            for (int i = 0; i < grafo.getTotalusers(); i++) {
                NodoLista nodo = grafo.getUserList()[i].getHead();
                while (nodo != null) {
                    wr.append(grafo.getUserList()[i].getId() + ", " + nodo.getId() + ", " + nodo.getTime_value() + "\n");
                    nodo = (NodoLista) nodo.getNext();
                }
            }
            wr.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
