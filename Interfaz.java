package Ventanas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2sesion = new javax.swing.JButton();
        BtnRegistro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtPasword = new javax.swing.JPasswordField();
        CbxUser = new javax.swing.JComboBox<String>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 90, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Iniciar Sesión");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 150, 60));

        jButton2sesion.setBackground(new java.awt.Color(255, 255, 255));
        jButton2sesion.setForeground(new java.awt.Color(0, 0, 255));
        jButton2sesion.setText("INICIAR");
        jButton2sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2sesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        BtnRegistro.setForeground(new java.awt.Color(0, 0, 255));
        BtnRegistro.setText("REGISTRO");
        BtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/índice2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 40, 40));

        TxtPasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPaswordActionPerformed(evt);
            }
        });
        getContentPane().add(TxtPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 140, 40));

        CbxUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Administrador", "Empleado" }));
        CbxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxUserActionPerformed(evt);
            }
        });
        getContentPane().add(CbxUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 140, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Columna Izquierda.jpg"))); // NOI18N
        jLabel8.setText("SAs");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 380, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_size_invert.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ICONOR.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Columa Superior.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2sesionActionPerformed
        try{
            this.setVisible(false);
        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionBd conn = new ConexionBd();
        Connection con = conn.getConnection();
        String Pass = String.valueOf(TxtPasword.getPassword());
        String Tipo_u = CbxUser.getSelectedItem().toString();
        String verificar = "select*from RegistroP where Cargo = '" + Tipo_u + "' and Contraseña = '" + Pass + "'";
        ps = con.prepareStatement(verificar);
        rs=ps.executeQuery();
        if (rs.next()){
            Menu obj = new Menu();
            obj.setVisible(true);
            JOptionPane.showMessageDialog(null, "Contraseña Correcta");
              this.setVisible(false);
        }else{
            this.setVisible(true);
            Interfaz obj = new Interfaz();
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
            obj.setVisible(true);
        }
        }catch(Exception e){
            System.err.println(e.toString());
            
        }
    }//GEN-LAST:event_jButton2sesionActionPerformed

    private void BtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroActionPerformed
        this.setVisible(false);
        RegistroP obj = new RegistroP();
        obj.setVisible(true);
        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionBd conn = new ConexionBd();
        Connection con = conn.getConnection();
    }//GEN-LAST:event_BtnRegistroActionPerformed

    private void TxtPaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPaswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPaswordActionPerformed

    private void CbxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxUserActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistro;
    private javax.swing.JComboBox<String> CbxUser;
    private javax.swing.JPasswordField TxtPasword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
