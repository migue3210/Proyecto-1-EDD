/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Nicoll Pinzon
 */
public class Agregar_Amigo extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_Amigo
     */
    public Agregar_Amigo() {
        initComponents();
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
        Usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
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

        Usuario.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        Id.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 60, 20));

        agregar_amigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/BotonAgregarAmi.png"))); // NOI18N
        getContentPane().add(agregar_amigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 180, 60));

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Guardar.png"))); // NOI18N
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 190, 60));

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/atras.png"))); // NOI18N
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 170, 90));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/x2.png"))); // NOI18N
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Agregar2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                new Agregar_Amigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton agregar_amigo;
    private javax.swing.JButton atras;
    private javax.swing.JButton exit;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}