package inventariobite;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BibliotecaDigital extends javax.swing.JFrame {

    public BibliotecaDigital() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo BITE chiquito.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1_Foto2 = new javax.swing.JLabel();
        jLabel1_Fotos1 = new javax.swing.JLabel();
        Salir_btn = new javax.swing.JButton();
        Acceder_btn = new javax.swing.JButton();
        VerInventario_btn = new javax.swing.JButton();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoBite.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 360, -1));

        jLabel1_Foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fotos2.png"))); // NOI18N
        jLabel1_Foto2.setText("jLabel1");
        getContentPane().add(jLabel1_Foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 370, -1));

        jLabel1_Fotos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fotos2.1.png"))); // NOI18N
        jLabel1_Fotos1.setText("jLabel1");
        getContentPane().add(jLabel1_Fotos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 370, -1));

        Salir_btn.setBackground(new java.awt.Color(255, 204, 0));
        Salir_btn.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        Salir_btn.setForeground(new java.awt.Color(51, 51, 0));
        Salir_btn.setText("Salir");
        Salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Salir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 140, 40));

        Acceder_btn.setBackground(new java.awt.Color(255, 204, 0));
        Acceder_btn.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        Acceder_btn.setText("Acceder");
        Acceder_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acceder_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Acceder_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 210, 70));

        VerInventario_btn.setBackground(new java.awt.Color(255, 204, 0));
        VerInventario_btn.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        VerInventario_btn.setText("Ver Inventario");
        VerInventario_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInventario_btnActionPerformed(evt);
            }
        });
        getContentPane().add(VerInventario_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 210, 70));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        jLabel_Fondo.setText("jLabel1");
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 839, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Salir_btnActionPerformed

    private void VerInventario_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInventario_btnActionPerformed
        
        try {
        
        File Archivo_txt = new File("Libros.txt");
        PrintWriter Pw;
        if(!Archivo_txt.exists()){
                JOptionPane.showMessageDialog(null, "No hay ningún libro en el inventario, para verlo, pirmero debe añadir libros");
        }else{
            
            VerInventario abrir;
            abrir = new VerInventario();
            abrir.setVisible(true); 
            dispose(); 
            
        }
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaDigital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_VerInventario_btnActionPerformed

    private void Acceder_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acceder_btnActionPerformed
        AccederUsuario abrir = new AccederUsuario();
        abrir.setVisible(true); 
        dispose();
    }//GEN-LAST:event_Acceder_btnActionPerformed

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
            java.util.logging.Logger.getLogger(BibliotecaDigital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BibliotecaDigital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BibliotecaDigital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BibliotecaDigital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BibliotecaDigital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acceder_btn;
    private javax.swing.JButton Salir_btn;
    private javax.swing.JButton VerInventario_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_Foto2;
    private javax.swing.JLabel jLabel1_Fotos1;
    private javax.swing.JLabel jLabel_Fondo;
    // End of variables declaration//GEN-END:variables
}
