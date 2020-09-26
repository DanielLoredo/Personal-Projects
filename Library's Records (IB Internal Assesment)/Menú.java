package inventariobite;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menú extends javax.swing.JFrame {

    public Menú() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        RegresarAnterior_btn = new javax.swing.JButton();
        RegresarAInicio_btn = new javax.swing.JButton();
        VerInventario_btn = new javax.swing.JButton();
        ModificarInventario_btn = new javax.swing.JButton();
        Agregar_btn = new javax.swing.JButton();
        Eliminar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoBiteChiquito.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        RegresarAnterior_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regresar2.png"))); // NOI18N
        RegresarAnterior_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarAnterior_btnActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarAnterior_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 40, 30));

        RegresarAInicio_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita1.png"))); // NOI18N
        RegresarAInicio_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarAInicio_btnActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarAInicio_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 50, 30));

        VerInventario_btn.setBackground(new java.awt.Color(255, 204, 0));
        VerInventario_btn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        VerInventario_btn.setText("Ver Inventario");
        VerInventario_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInventario_btnActionPerformed(evt);
            }
        });
        getContentPane().add(VerInventario_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 230, 40));

        ModificarInventario_btn.setBackground(new java.awt.Color(255, 204, 0));
        ModificarInventario_btn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        ModificarInventario_btn.setText("Modificar Inventario");
        ModificarInventario_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarInventario_btnActionPerformed(evt);
            }
        });
        getContentPane().add(ModificarInventario_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, 40));

        Agregar_btn.setBackground(new java.awt.Color(255, 204, 0));
        Agregar_btn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Agregar_btn.setText("Agregar");
        Agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 230, 40));

        Eliminar_btn.setBackground(new java.awt.Color(255, 204, 0));
        Eliminar_btn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Eliminar_btn.setText("Elminar");
        Eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 298, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerInventario_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInventario_btnActionPerformed

        try {
        
        File Archivo_txt = new File("Libros.txt");
        PrintWriter Pw;
        if(!Archivo_txt.exists()){
                JOptionPane.showMessageDialog(null, "No hay ningún libro en el inventario, para verlo, pirmero debe añadir libros");
        }else{
            
            VerInventario abrir = new VerInventario();
            abrir.setVisible(true); 
            dispose(); 
            
        }
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaDigital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_VerInventario_btnActionPerformed

    private void ModificarInventario_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarInventario_btnActionPerformed

        File Archivo_txt = new File("Libros.txt");
        PrintWriter Pw;
        if(!Archivo_txt.exists()){
            JOptionPane.showMessageDialog(null, "No hay ningún libro en el inventario, para verlo, pirmero debe añadir libros");
        }else{
            
            ModificarInventario abrir = new ModificarInventario();
            abrir.setVisible(true); 
            dispose();
            
        }
    }//GEN-LAST:event_ModificarInventario_btnActionPerformed

    private void Agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_btnActionPerformed
        Agregar abrir = new Agregar();
        abrir.setVisible(true); 
        dispose();
    }//GEN-LAST:event_Agregar_btnActionPerformed

    private void Eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_btnActionPerformed
       
        File Archivo_txt = new File("Libros.txt");
        PrintWriter Pw;
        if(!Archivo_txt.exists()){
            JOptionPane.showMessageDialog(null, "No hay ningún libro en el inventario, para verlo, pirmero debe añadir libros");
        }else{
            
            Eliminar abrir = new Eliminar();
            abrir.setVisible(true); 
            dispose();  
        }
        
        
        
        
        
    }//GEN-LAST:event_Eliminar_btnActionPerformed

    private void RegresarAInicio_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarAInicio_btnActionPerformed
        BibliotecaDigital abrir = new BibliotecaDigital();
        abrir.setVisible(true); 
        dispose();
    }//GEN-LAST:event_RegresarAInicio_btnActionPerformed

    private void RegresarAnterior_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarAnterior_btnActionPerformed
        AccederUsuario abrir = new AccederUsuario();
        abrir.setVisible(true); 
        dispose();
    }//GEN-LAST:event_RegresarAnterior_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_btn;
    private javax.swing.JButton Eliminar_btn;
    private javax.swing.JButton ModificarInventario_btn;
    private javax.swing.JButton RegresarAInicio_btn;
    private javax.swing.JButton RegresarAnterior_btn;
    private javax.swing.JButton VerInventario_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
