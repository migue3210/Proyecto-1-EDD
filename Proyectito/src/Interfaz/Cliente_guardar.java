/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import static Interfaz.Bienvenido20.grafito;
import javax.swing.JOptionPane;
import proyectito.Grafo;


/**
 *
 * @author Nicoll Pinzon
 */
public class Cliente_guardar extends javax.swing.JFrame {
    public static Agregar_Amigo a1;
    public static Menu m;
    /**
     * Creates new form Cliente_guardar
     */
    public Cliente_guardar(Agregar_Amigo a1) {
        initComponents();
       
        amigos.setText(grafito.amigoGrafo());
        this.a1 = a1;
        
        a1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    public Cliente_guardar(Menu m) {
        initComponents();
        this.m = m;
        amigos.setText(grafito.amigoGrafo());
        m.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
    }
    public void Eliminar(String el){
        eliminar.setText(el);
        eliminar.setFont(new java.awt.Font("Rockwell", 1, 12));
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
        exit = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        amigos = new javax.swing.JTextArea();
        eliminar = new javax.swing.JLabel();
        numid = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/x2.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 20, 20));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/atras.png"))); // NOI18N
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 170, 80));

        amigos.setColumns(20);
        amigos.setRows(5);
        jScrollPane1.setViewportView(amigos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 200, 170));

        eliminar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(0, 0, 0));
        eliminar.setText("Inserte el ID de tu amigo:");
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        numid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numidActionPerformed(evt);
            }
        });
        getContentPane().add(numid, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 130, -1));

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/ok.png"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/amigos.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numidActionPerformed
        
    }//GEN-LAST:event_numidActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Object cambio = "Inserte el ID de tu amigo:";
        if (cambio.equals(eliminar.getText()) ){
            int verdad = JOptionPane.showConfirmDialog(null, "Seguro que no quieres continuar ?");
        if (verdad == 0){
        a1.setVisible(true);
            this.setVisible(false);}
          
        }else{
            int verdad = JOptionPane.showConfirmDialog(null, "Seguro que no quieres continuar ?");
        if (verdad == 0){
        m.setVisible(true);
            this.setVisible(false);}
            
        }
        
        
    }//GEN-LAST:event_atrasActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        Object cambio = "Inserte el ID de tu amigo:";
        try{
        
        if (cambio == eliminar.getText() ){
            try{
            int num = grafito.searchUser(Integer.parseInt(numid.getText()));
            if (num== -1){
                JOptionPane.showMessageDialog(null, "No existe una persona con este id: "+ numid.getText());
            }else {
           Agregar_tiempo at = new Agregar_tiempo(this);
            }
            }catch( Exception e ){
                JOptionPane.showMessageDialog(null,"Error, no pusiste un numero");
            }
            
            
        }else{
            try{
            int num = grafito.searchUser(Integer.parseInt(numid.getText()));
            if (num== -1){
                JOptionPane.showMessageDialog(null, "No existe una persona con este id: "+ numid.getText());
            }else {
           Amigo_eliminar2 ae = new Amigo_eliminar2(this);
            ae.numeroidel(Integer.parseInt(numid.getText()));}
            }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error, no pusiste un numero");}
        }} catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error, no pusiste un numero");
            
        }
    }//GEN-LAST:event_okActionPerformed

    public int numero_ami(){
        try{
        return Integer.parseInt(numid.getText());}
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error, no pusiste un numero");
        }return -1;
    }
    
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
            java.util.logging.Logger.getLogger(Cliente_guardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente_guardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente_guardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente_guardar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Cliente_guardar(a1).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea amigos;
    private javax.swing.JButton atras;
    private javax.swing.JLabel eliminar;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numid;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
