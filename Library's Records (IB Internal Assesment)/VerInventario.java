package inventariobite;
import static inventariobite.AccederUsuario.getAcceder;
import static inventariobite.AccederUsuario.setAcceder;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;


public class VerInventario extends javax.swing.JFrame {
        
        private ArrayList<Libro> ListaLibros;
        private TableRowSorter Filtro;
        
        
    public VerInventario() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        
        MostrarTabla();
        LibrosActuales();
        
    }
    
    public void FiltrarLibros(int i){
        int ColumnaDeFiltro = i;
                           
        if(ColumnaDeFiltro == 0){
          Filtro.setRowFilter(RowFilter.regexFilter(filtrar_txt.getText(), ColumnaDeFiltro));  
        }else{
          Filtro.setRowFilter(RowFilter.regexFilter("(?i)" +filtrar_txt.getText(), ColumnaDeFiltro));
        }
    }
    
    
    public void LibrosActuales() throws FileNotFoundException, IOException{
        try{
        
        File Archivo_txt = new File("Libros.txt");
        FileReader Fr = new FileReader(Archivo_txt);
        BufferedReader Br = new BufferedReader(Fr);
        
        String linea;
        int LibrosActuales = 0;
        while((linea = Br.readLine()) != null){
            LibrosActuales++;
        }
        LibrosActuales = LibrosActuales/6;
        
        LibrosActuales_lbl.setText("Libros actuales: " + Integer.toString(LibrosActuales));
        
        }catch (Exception e){

        }
    }
    
    public void MostrarTabla(){
        try{
         
        ListaLibros = new ArrayList<Libro>();
       
        File Archivo_txt = new File("Libros.txt");
        FileReader Fr;
        BufferedReader Br;
        Libro libro, aux = new Libro(0,null,null,null,null,null);
        
            Fr = new FileReader(Archivo_txt);
            Br = new BufferedReader(Fr);
            libro = aux.obtenerLibro(Br);
            
            while(libro != null){
                ListaLibros.add(libro);
                libro = aux.obtenerLibro(Br);
            }
        Br.close();
        Fr.close();
            
        
        String Mat[][] = new String[ListaLibros.size()][6];
        Libro x;
        for(int i = 0; i < ListaLibros.size(); i++){
            x = ListaLibros.get(i);
            Mat[i][0] = Integer.toString(x.getId());
            Mat[i][1] = x.getTitulo();
            Mat[i][2] = x.getAutor();
            Mat[i][3] = x.getUbicacion();
            Mat[i][4] = x.getLector();
            Mat[i][5] = x.getTipo();
        }
        
        JTable_Libros.setModel(new javax.swing.table.DefaultTableModel(
                Mat,
            new String [] {
                "ID", "Título", "Autor", "Ubicación", "Lector", "Tipo"
            }
                
        ));
        
            TableColumnModel columnModel = JTable_Libros.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(40);
            columnModel.getColumn(1).setPreferredWidth(220);
            columnModel.getColumn(2).setPreferredWidth(150);
            columnModel.getColumn(3).setPreferredWidth(95);
            columnModel.getColumn(4).setPreferredWidth(85);
            columnModel.getColumn(5).setPreferredWidth(80);
        
        DefaultTableCellRenderer titular = new DefaultTableCellRenderer();
        titular.setBackground(new Color(239, 198, 46));
        for (int i = 0; i < JTable_Libros.getModel().getColumnCount(); i++) {
        JTable_Libros.getColumnModel().getColumn(i).setHeaderRenderer(titular);
        JTable_Libros.setEnabled(false);
      
        }
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Aun no se han añadido libros");
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        filtrar_box = new javax.swing.JComboBox<>();
        filtrar_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable_Libros = new javax.swing.JTable();
        imprimir_btn = new javax.swing.JButton();
        LibrosActuales_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regresar2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 40, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casita1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 50, 30));

        filtrar_box.setBackground(new java.awt.Color(235, 177, 4));
        filtrar_box.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        filtrar_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Título", "ID", "Autor", "Ubicación", "Lector", "Tipo" }));
        filtrar_box.setToolTipText("Filtrar");
        getContentPane().add(filtrar_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 30));

        filtrar_txt.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        filtrar_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrar_txtActionPerformed(evt);
            }
        });
        filtrar_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtrar_txtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                filtrar_txtKeyTyped(evt);
            }
        });
        getContentPane().add(filtrar_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 460, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 0));

        JTable_Libros.setBackground(new java.awt.Color(255, 255, 204));
        JTable_Libros.setFont(new java.awt.Font("Californian FB", 0, 16)); // NOI18N
        JTable_Libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Ubicación", "Lector", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Libros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTable_Libros.setGridColor(new java.awt.Color(255, 51, 204));
        JTable_Libros.setRowMargin(3);
        jScrollPane2.setViewportView(JTable_Libros);
        if (JTable_Libros.getColumnModel().getColumnCount() > 0) {
            JTable_Libros.getColumnModel().getColumn(0).setResizable(false);
            JTable_Libros.getColumnModel().getColumn(0).setPreferredWidth(50);
            JTable_Libros.getColumnModel().getColumn(1).setResizable(false);
            JTable_Libros.getColumnModel().getColumn(1).setPreferredWidth(250);
            JTable_Libros.getColumnModel().getColumn(2).setResizable(false);
            JTable_Libros.getColumnModel().getColumn(2).setPreferredWidth(200);
            JTable_Libros.getColumnModel().getColumn(3).setResizable(false);
            JTable_Libros.getColumnModel().getColumn(4).setResizable(false);
            JTable_Libros.getColumnModel().getColumn(5).setResizable(false);
        }

        jScrollPane1.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 680, 460));

        imprimir_btn.setBackground(new java.awt.Color(255, 204, 0));
        imprimir_btn.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        imprimir_btn.setText("Imprimir");
        imprimir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir_btnActionPerformed(evt);
            }
        });
        getContentPane().add(imprimir_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, -1, -1));

        LibrosActuales_lbl.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        LibrosActuales_lbl.setText("Libros Actuales: ");
        getContentPane().add(LibrosActuales_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoBiteChiquito.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo 2.3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 730, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtrar_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrar_txtActionPerformed

    }//GEN-LAST:event_filtrar_txtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setAcceder(false);
        BibliotecaDigital abrir = new BibliotecaDigital();
        abrir.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(getAcceder() == true){
        Menú abrir = new Menú();
        abrir.setVisible(true); 
        dispose(); 
        }else{
        BibliotecaDigital abrir = new BibliotecaDigital();
        abrir.setVisible(true); 
        dispose();  
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imprimir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir_btnActionPerformed

        MessageFormat titulo = new MessageFormat("Libros existente en bodega");
        try{
            JTable_Libros.print(JTable.PrintMode.NORMAL, titulo, null, true, null, true); 
        }catch(java.awt.print.PrinterException e){
            System.err.format("No se puede imprimir", e.getMessage());
        }

    }//GEN-LAST:event_imprimir_btnActionPerformed

    
    
    private void filtrar_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtrar_txtKeyPressed
       
    }//GEN-LAST:event_filtrar_txtKeyPressed

    private void filtrar_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtrar_txtKeyTyped
        
        filtrar_txt.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
            
                
                String opcion = filtrar_box.getSelectedItem().toString();
                int i = 0;
                
                if(opcion.equals("Título")){
                    i = 1;
                }   
                if(opcion.equals("Autor")){
                    i = 2;
                }   
                if(opcion.equals("Ubicación")){
                    i = 3;
                }   
                if(opcion.equals("Lector")){
                    i = 4;
                }   
                if(opcion.equals("Tipo")){
                    i = 5;
                }   
                FiltrarLibros(i);
            }
    });
            Filtro = new TableRowSorter(JTable_Libros.getModel());
            JTable_Libros.setRowSorter(Filtro);
        
    }//GEN-LAST:event_filtrar_txtKeyTyped

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
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VerInventario().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VerInventario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_Libros;
    private javax.swing.JLabel LibrosActuales_lbl;
    private javax.swing.JComboBox<String> filtrar_box;
    private javax.swing.JTextField filtrar_txt;
    private javax.swing.JButton imprimir_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    
}
