package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class RegistroP extends javax.swing.JFrame {

    public RegistroP() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   private void limpiarcajas() {
        TxtNombre.setText(null);
        TxtApellido.setText(null);
        TxtTelefono.setText(null);
        TxtCorreo.setText(null);
        CbxCargo.setSelectedIndex(0);
        TxtContraseña.setText(null);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/234794.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFomdo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jButton2sesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CbxCargo = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        TxtCode = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtContraseña = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2sesion1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jFomdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo A.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel1.setText("Registro Personal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 102, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel3.setText("Nombre(s)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 250, 30));

        jButton2sesion.setBackground(new java.awt.Color(204, 204, 255));
        jButton2sesion.setForeground(new java.awt.Color(0, 0, 255));
        jButton2sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Indice8.jpg"))); // NOI18N
        jButton2sesion.setText("GUARDAR");
        jButton2sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2sesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 102, 255));
        jLabel4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel4.setText("Apellido(s)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 250, 30));

        jLabel5.setBackground(new java.awt.Color(0, 102, 255));
        jLabel5.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel5.setText("Cargo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        CbxCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Administrador", "Empleado" }));
        getContentPane().add(CbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 250, 30));

        jLabel6.setBackground(new java.awt.Color(0, 102, 255));
        jLabel6.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel6.setText("N° Ficha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        TxtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodeActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 90, 30));

        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });
        TxtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 250, 30));

        TxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 250, 30));

        TxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 250, 30));

        jLabel7.setBackground(new java.awt.Color(0, 102, 255));
        jLabel7.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 102, 255));
        jLabel8.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel8.setText("Correo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 102, 255));
        jLabel9.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        jButton2sesion1.setBackground(new java.awt.Color(255, 255, 255));
        jButton2sesion1.setForeground(new java.awt.Color(0, 0, 255));
        jButton2sesion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/índice7.png"))); // NOI18N
        jButton2sesion1.setText("REGRESAR");
        jButton2sesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2sesion1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2sesion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Columa Superior.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 430));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Columna Izquierda.jpg"))); // NOI18N
        jLabel12.setText("SAs");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void jButton2sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2sesionActionPerformed

        if(TxtNombre.getText().isEmpty()|| TxtApellido.getText().isEmpty()|| TxtTelefono.getText().isEmpty()|| TxtCorreo.getText().isEmpty()||CbxCargo.getSelectedItem().toString().isEmpty()||TxtContraseña.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Porfavor Diligencie todos los campos requeridos","Datos incompletos",JOptionPane.WARNING_MESSAGE);
        }else{
        PreparedStatement ps = null;
        ResultSet rs = null;
        ConexionBd conn = new ConexionBd();
        try{
        Connection con = conn.getConnection();
        ps = con.prepareStatement("insert into RegistroP(Nombre,Apellido,Telefono,Correo_electronico,Cargo,Contraseña)values(?,?,?,?,?,?)");
        ps.setString(1, TxtNombre.getText());
        ps.setString(2, TxtApellido.getText());
        ps.setString(3, TxtTelefono.getText());// combo box
        ps.setString(4, TxtCorreo.getText());
        ps.setString(5, CbxCargo.getSelectedItem().toString());
        ps.setString(6, TxtContraseña.getText());

        int res = ps.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Datos Guardados exitosamente");
            limpiarcajas();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos");
        }
    }catch (Exception e) {
            System.out.println(e);
    }
        this.setVisible(false);
        Interfaz obj = new Interfaz();
        obj.setVisible(true);
        }
    }//GEN-LAST:event_jButton2sesionActionPerformed

    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoActionPerformed

    private void TxtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodeActionPerformed

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed

    }//GEN-LAST:event_TxtTelefonoActionPerformed

    private void TxtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraseñaActionPerformed

    private void TxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreoActionPerformed

    private void jButton2sesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2sesion1ActionPerformed

            this.setVisible(false);
            Registros obj = new Registros();
            obj.setVisible(true);
    }//GEN-LAST:event_jButton2sesion1ActionPerformed

    private void TxtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTelefonoKeyTyped
        char c =evt.getKeyChar();
        if(c<'0'|| c>'9')evt.consume();
    }//GEN-LAST:event_TxtTelefonoKeyTyped

    private void TxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyTyped
       Character a=evt.getKeyChar();
       if(!Character.isLetter(a)&& a!=KeyEvent.VK_SPACE){
           evt.consume();
       }
    }//GEN-LAST:event_TxtNombreKeyTyped

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
            java.util.logging.Logger.getLogger(RegistroP.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroP.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroP.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroP.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxCargo;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCode;
    private javax.swing.JTextField TxtContraseña;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton jButton2sesion;
    private javax.swing.JButton jButton2sesion1;
    private javax.swing.JLabel jFomdo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
