/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class TxtManager {
    public Grafo readText() {
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("./test"));
        int result = file.showOpenDialog(null);
        file.setDialogTitle("Open file");
        File txt = file.getSelectedFile();
        Grafo grafo = new Grafo(1);
        String line;
        String users_txt = "";
        BufferedReader lector;

        try {
            if (result == JFileChooser.APPROVE_OPTION) {
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
                        String[] user = users_split[i].split(", ");
                        if (!users_split[i].equals("Usuarios")) {
                            grafo.addUser(Integer.parseInt(user[0]), user[1]);
                        }
                    }
                    grafo.printGrafo();
                }
                lector.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún documento txt");
            }

        } catch (Exception err) {
            System.out.println(err);
            JOptionPane.showMessageDialog(null, "error al momento de leer los clientes.");
        }
        return grafo;
    }
}
