/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import static Interfaz.Bienvenido20.grafito;
import static Interfaz.Bienvenido20.txt;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import proyectito.Mostrar_Grafo2;
import org.graphstream.ui.swing_viewer.ViewPanel;
import org.graphstream.ui.view.Viewer;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import proyectito.Grafo;
import proyectito.TxtManager;

/**
 *
 * @author Nicoll Pinzon
 */
public class Menu extends javax.swing.JFrame {

    public static Bienvenido20 b1;
    public static Amigo_eliminar2 ane2;
    public static Guardcar_Usuario gb;
    public static boolean seguro = false;
    public static BFS_DFS bfs_dfs;
    
     
    
     /* Creates new form Menu
     */
    public Menu(BFS_DFS bfs_dfs) {
        initComponents();
        this.bfs_dfs = bfs_dfs;
        bfs_dfs.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
    }
    public Menu(Bienvenido20 b1) {
        initComponents();
        this.b1 = b1;
        b1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        
    }
    public Menu(Amigo_eliminar2 ane2) {
        initComponents();
        this.ane2 = ane2;
        ane2.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    public Menu(Guardcar_Usuario gb) {
        initComponents();
        this.gb = gb;
        gb.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agregar_doc = new javax.swing.JButton();
        agregar_usuario = new javax.swing.JButton();
        mostrar_grafo = new javax.swing.JButton();
        mostrar_islas = new javax.swing.JButton();
        puentes = new javax.swing.JButton();
        eliminar_usuario = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        agregar_doc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonAgregar3.png"))); // NOI18N
        agregar_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_docActionPerformed(evt);
            }
        });
        getContentPane().add(agregar_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, 80));

        agregar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonUsuario.png"))); // NOI18N
        agregar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(agregar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 180, 80));

        mostrar_grafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar_grafo.png"))); // NOI18N
        mostrar_grafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_grafoActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar_grafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, 80));

        mostrar_islas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Mostrar_Islas.png"))); // NOI18N
        mostrar_islas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_islasActionPerformed(evt);
            }
        });
        getContentPane().add(mostrar_islas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 180, 80));

        puentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/puentes.png"))); // NOI18N
        puentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puentesActionPerformed(evt);
            }
        });
        getContentPane().add(puentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 180, 80));

        eliminar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_usuario.png"))); // NOI18N
        eliminar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 190, 90));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x2.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 20, 20));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MENU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar_datos4.png"))); // NOI18N
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        
        if (true == seguro){
            System.exit(0);
        }else{
            Object verdad = JOptionPane.showConfirmDialog(null,"Seguro que no quieres guardar los cambios?");
        if (verdad.equals(0)){
              System.exit(0);
              
          }
        
        }
    }//GEN-LAST:event_exitActionPerformed

    private void agregar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_usuarioActionPerformed
       
        Agregar_Amigo a1 = new Agregar_Amigo(this);
    }//GEN-LAST:event_agregar_usuarioActionPerformed

    private void eliminar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_usuarioActionPerformed
        String el = "Inserte el ID que desea eliminar:";
        Cliente_guardar c1= new Cliente_guardar(this);
       c1.Eliminar(el);
        
    }//GEN-LAST:event_eliminar_usuarioActionPerformed

    private void agregar_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_docActionPerformed
         
        txt.writeText(grafito);
       
        grafito = txt.readText();
    }//GEN-LAST:event_agregar_docActionPerformed

    private void mostrar_grafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_grafoActionPerformed
        System.setProperty("org.graphstream.ui", "swing");
        

        Graph graph = new SingleGraph("Proyecto");
        graph.clear();
        int id = 0;

        for (int i = 0; i < grafito.getTotalusers(); i++) {
            try {
            graph.addNode(Integer.toString(grafito.getUserList()[i].getId()));
            System.out.println(grafito.getUserList()[i].getId());
            }catch (Exception e){
            }
        }

         new Mostrar_Grafo2(grafito, graph);
         
    }//GEN-LAST:event_mostrar_grafoActionPerformed

    private void mostrar_islasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_islasActionPerformed
        MostrarIslas mi1= new MostrarIslas(this);
    }//GEN-LAST:event_mostrar_islasActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        seguro = true;
        txt.writeText(grafito);
                
    }//GEN-LAST:event_guardarActionPerformed

    private void puentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puentesActionPerformed
        Listas_puentes lp= new Listas_puentes(this);
    }//GEN-LAST:event_puentesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(b1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_doc;
    private javax.swing.JButton agregar_usuario;
    private javax.swing.JButton eliminar_usuario;
    private javax.swing.JButton exit;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrar_grafo;
    private javax.swing.JButton mostrar_islas;
    private javax.swing.JButton puentes;
    // End of variables declaration//GEN-END:variables
}
