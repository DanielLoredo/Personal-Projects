package inventariobite;
public class AccederUsuario extends javax.swing.JFrame {

    public AccederUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static boolean acceder = false;
    
    
    public static boolean getAcceder(){
        return acceder;
    }
    public static void setAcceder(boolean acceder){
        AccederUsuario.acceder = acceder;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Usuario_txt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        boton_entrar = new javax.swing.JButton();
        Error_label = new javax.swing.JLabel();
        Contraseña_txt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoBiteChiquito.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel2.setText("Usuario");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        Usuario_txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Usuario_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario_txtActionPerformed(evt);
            }
        });
        getContentPane().add(Usuario_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 290, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regresar2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 40, 30));

        boton_entrar.setBackground(new java.awt.Color(255, 204, 0));
        boton_entrar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        boton_entrar.setText("Entrar");
        boton_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 130, 40));

        Error_label.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Error_label.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(Error_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 280, 60));

        Contraseña_txt.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Contraseña_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contraseña_txtActionPerformed(evt);
            }
        });
        getContentPane().add(Contraseña_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 290, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 487, 247));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setAcceder(false);
        BibliotecaDigital abrir = new BibliotecaDigital();
        abrir.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Usuario_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuario_txtActionPerformed

    private void boton_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_entrarActionPerformed
        
        String Usuario = "Dueño";
        String Contraseña= "1234";
        if(Usuario_txt.getText().equals(Usuario) && Contraseña_txt.getText().equals(Contraseña)){  
        setAcceder(true);
        Menú abrir = new Menú();
        abrir.setVisible(true); 
        dispose();
        }
        if(Usuario_txt.getText().length()==0 || Contraseña_txt.getText().length() == 0){
            Error_label.setText("Favor de introducir usuario y contraseña");
        }else{
            Error_label.setText("El usuario o la contraseña es inválido");
        }
        
    }//GEN-LAST:event_boton_entrarActionPerformed

    private void Contraseña_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contraseña_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contraseña_txtActionPerformed

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
            java.util.logging.Logger.getLogger(AccederUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccederUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccederUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccederUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccederUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contraseña_txt;
    private javax.swing.JLabel Error_label;
    private javax.swing.JTextField Usuario_txt;
    private javax.swing.JButton boton_entrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
