/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import static Interfaz.Bienvenido20.grafito;
import static Interfaz.Guardcar_Usuario.validar;
import static Interfaz.Menu.seguro;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicoll Pinzon
 */
public class Agregar_Amigo extends javax.swing.JFrame {
    public static Menu m;
    public static int idUsr;
    
    
    /**
     * Creates new form Agregar_Amigo
     */
    public Agregar_Amigo(Menu m) {
        initComponents();
        this.m = m;
        m.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        Random aleatorio = new Random ();
        int numero = aleatorio.nextInt (1000);
        int num = 1;
        while (num != -1) {
        numero = aleatorio.nextInt (1000);
        num = grafito.searchUser(numero);}
        idUsr = numero;
        id.setText(Integer.toString(numero));       
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        agregar_amigo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Crear Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        usuario.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        id.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 100, 20));

        agregar_amigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAgregarAmi.png"))); // NOI18N
        agregar_amigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_amigoActionPerformed(evt);
            }
        });
        getContentPane().add(agregar_amigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 180, 60));

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.png"))); // NOI18N
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 190, 60));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 170, 90));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x2.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        if (true == seguro){
            System.exit(0);
        }else{
            Object verdd = JOptionPane.showConfirmDialog(null,"Seguro que no quieres guardar los cambios?");
        if (verdd.equals(0)){
              System.exit(0);
              
          }
        
        }
    }//GEN-LAST:event_exitActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        if (true == validar){
            this.setVisible(false);
        m.setVisible(true);
        }else{
            
            Object verdad = JOptionPane.showConfirmDialog(null,"Seguro que no quieres guardar los cambios?");
          if (verdad.equals(0)){
              this.setVisible(false);
            m.setVisible(true);
              
          }
        }
        
    }//GEN-LAST:event_atrasActionPerformed

    public int idUser(){
        return Integer.parseInt(id.getText());
    }
    
    public String nameUser(){
         String user_name = "@";
         user_name += usuario.getText();
         
        return user_name;
    }
    
    private void agregar_amigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_amigoActionPerformed
        String use = usuario.getText();
        String nulo ="";
        if(!use.equalsIgnoreCase(nulo)){
            if(-1 == grafito.searchUser(idUser())){
            grafito.addUser(idUser(), nameUser());}
            String el = "Inserte el ID de tu amigo:";
            
            Cliente_guardar c1 = new Cliente_guardar(this);

            c1.Eliminar(el);
          
        
      }else{
            
          JOptionPane.showMessageDialog(null,"Si quiere continuar creando el usuario, ponga un nombre de usuario");}
    }//GEN-LAST:event_agregar_amigoActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if(!usuario.getText().equalsIgnoreCase("")){
          if(-1 == grafito.searchUser(idUser())){
            grafito.addUser(idUser(), nameUser());}
        Guardcar_Usuario gu = new Guardcar_Usuario(this);
      }else{
          JOptionPane.showMessageDialog(null,"Si quiere guardar los cambios hechos, ponga un nombre de usuario");
      }
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_Amigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Amigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Amigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Amigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Amigo(m).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_amigo;
    private javax.swing.JButton atras;
    private javax.swing.JButton exit;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
