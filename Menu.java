package Ventanas;
import javax.swing.JOptionPane;
public class Menu extends javax.swing.JFrame {
    public Menu(){
        initComponents();
        this.setLocationRelativeTo(null);
        //TxtU.setText(Interfaz.date);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        TxtU = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnRE = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtnUsuarios = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BtnSesion = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ICONOR.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtU.setText("jLabel1");
        getContentPane().add(TxtU, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 160, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user-logo-computer-icons-industry-icon-user-experience-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Columna Izquierda.jpg"))); // NOI18N
        jLabel3.setText("SAs");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 70));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        BtnRE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/índice3.png"))); // NOI18N
        BtnRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnREMouseClicked(evt);
            }
        });
        getContentPane().add(BtnRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 60, -1));

        jLabel10.setBackground(new java.awt.Color(0, 102, 255));
        jLabel10.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel10.setText("Reportes");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 102, 255));
        jLabel11.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel11.setText("Usuarios");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        BtnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario-removebg-preview.png"))); // NOI18N
        BtnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(BtnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 102, 255));
        jLabel12.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel12.setText("Nuevo Registro");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 102, 255));
        jLabel14.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel14.setText("Buscar");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ICONOR.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, -1));

        BtnSesion.setForeground(new java.awt.Color(0, 0, 255));
        BtnSesion.setText("Cerrar Sesión");
        BtnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSesionActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 30));

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/índice4-removebg-preview.png"))); // NOI18N
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Columa Superior.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnREMouseClicked
       this.setVisible(false);
       Registros1 obj = new Registros1();
       obj.setVisible(true);
    }//GEN-LAST:event_BtnREMouseClicked

    private void BtnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSesionActionPerformed
      
        JOptionPane.showMessageDialog(null,"Sesión cerrada con exito"); 
        this.setVisible(false);
        Interfaz obj = new Interfaz();
            obj.setVisible(true);
    }//GEN-LAST:event_BtnSesionActionPerformed

    private void BtnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUsuariosMouseClicked
        this.setVisible(false);
        RegistroP obj = new RegistroP();
         obj.setVisible(true);
    }//GEN-LAST:event_BtnUsuariosMouseClicked

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        
    }//GEN-LAST:event_BtnBuscarMouseClicked

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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnBuscar;
    private javax.swing.JLabel BtnRE;
    private javax.swing.JButton BtnSesion;
    private javax.swing.JLabel BtnUsuarios;
    private javax.swing.JLabel TxtU;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
