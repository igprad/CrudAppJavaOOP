/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.controller;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane; 

/**
 *
 * @author Andreas Aldito
 */
public class FormKategoriBarang extends javax.swing.JFrame implements SwingConstants
{
    controller con = new controller();
    int Globaltemp;
    int pointselectEdit;
    
    /**
     * Creates new form Transaksi
     */
    public FormKategoriBarang() {
        initComponents();
        //this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.jLabel1.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        //this.jLabel13.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setVisible(true);
        this.setResizable(false);
        //this.setAlwaysOnTop(true);
        this.jPanel3.setOpaque(false);;
        this.jPaneRegister.setVisible(false);
        this.jPaneEdit.setVisible(false);
        //this.jButton9.setHorizontalTextPosition( SwingConstants.RIGHT );
        //this.jButton9.setHorizontalAlignment(SwingConstants.RIGHT);
        showTable();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPaneRegister = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPaneEdit = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPaneRegister.setBackground(new java.awt.Color(250, 205, 138));
        jPaneRegister.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPaneRegister.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel8.setText("Tambah Kategori Barang");
        jPaneRegister.add(jLabel8);
        jLabel8.setBounds(20, 20, 270, 35);
        jPaneRegister.add(jTextField1);
        jTextField1.setBounds(20, 80, 261, 30);

        jLabel9.setText("Deskripsi");
        jPaneRegister.add(jLabel9);
        jLabel9.setBounds(20, 120, 160, 14);

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPaneRegister.add(jButton1);
        jButton1.setBounds(140, 230, 72, 23);

        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPaneRegister.add(jButton2);
        jButton2.setBounds(220, 230, 63, 23);
        jPaneRegister.add(jTextField7);
        jTextField7.setBounds(20, 140, 261, 80);

        jLabel14.setText("Nama Kategori");
        jPaneRegister.add(jLabel14);
        jLabel14.setBounds(20, 60, 190, 14);

        getContentPane().add(jPaneRegister);
        jPaneRegister.setBounds(200, 550, 300, 270);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Search-icon.png"))); // NOI18N
        jButton12.setText("Cari");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(980, 150, 360, 50);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/delete_converted.png"))); // NOI18N
        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1220, 540, 123, 52);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Login-out-icon.png"))); // NOI18N
        jButton9.setText("Logout");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(20, 590, 100, 40);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/edit_converted.png"))); // NOI18N
        jButton10.setText("Edit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(1090, 540, 120, 52);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Programming-Add-Property-icon.png"))); // NOI18N
        jButton11.setText("Tambah");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(960, 540, 120, 52);

        jPaneEdit.setBackground(new java.awt.Color(250, 205, 138));
        jPaneEdit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPaneEdit.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel13.setText("Edit Kategori Barang");
        jPaneEdit.add(jLabel13);
        jLabel13.setBounds(40, 20, 220, 35);
        jPaneEdit.add(jTextField2);
        jTextField2.setBounds(20, 90, 261, 30);

        jLabel15.setText("Deskripsi");
        jPaneEdit.add(jLabel15);
        jLabel15.setBounds(20, 130, 160, 14);

        jButton13.setText("Simpan");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPaneEdit.add(jButton13);
        jButton13.setBounds(140, 230, 72, 23);

        jButton14.setText("Batal");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPaneEdit.add(jButton14);
        jButton14.setBounds(220, 230, 63, 23);
        jPaneEdit.add(jTextField10);
        jTextField10.setBounds(20, 150, 261, 70);

        jLabel17.setText("Nama Kategori");
        jPaneEdit.add(jLabel17);
        jLabel17.setBounds(20, 70, 190, 14);

        getContentPane().add(jPaneEdit);
        jPaneEdit.setBounds(530, 550, 300, 270);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama Kategori", "Deskripsi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(300, 210, 1040, 320);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Computer-Hardware-Shutdown-icon.png"))); // NOI18N
        jButton7.setText("Keluar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(20, 640, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/bckgrnd2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            
            int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Apakah Anda Yakin ingin menghapus entri tersebut?", 
                                  "Peringatan", 
                                  JOptionPane.YES_NO_OPTION); 
            if (selectedOption == JOptionPane.YES_OPTION) 
            {
                con.deleteKategori((int)jTable2.getValueAt(jTable2.getSelectedRow(), 0));
                JOptionPane.showMessageDialog(null, "Data telah dihapus");
                showTable();
            }
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void selectedKategori(){
        int temp = jTable2.getSelectedRow();
        Globaltemp=jTable2.getSelectedRow();
        jTextField2.setText(jTable2.getValueAt(temp, 1).toString());
        jTextField10.setText(jTable2.getValueAt(temp, 2).toString());
    }
    
    private void showTable(){
        jTable2.setModel(con.showTableKategori());
        jTable2.getColumnModel().getColumn(0).setMaxWidth(50);
    }
    
    private void searchTableKategori(String key){
        jTable2.setModel(con.searchTableKategori(key));
        jTable2.getColumnModel().getColumn(0).setMaxWidth(50);    
    }
    
    private void setdisabled()
    {
        this.jButton11.setEnabled(false);
        this.jButton10.setEnabled(false);
        this.jButton5.setEnabled(false);
        this.jTextField3.setEnabled(false);
        this.jButton9.setEnabled(false);
        this.jButton7.setEnabled(false);
        this.jButton12.setEnabled(false);
    }
    
    private void enablein()
    {
        this.jButton11.setEnabled(true);
        this.jButton10.setEnabled(true);
        this.jButton5.setEnabled(true);
        this.jTextField3.setEnabled(true);
        this.jButton9.setEnabled(true);
        this.jButton7.setEnabled(true);
        this.jButton12.setEnabled(true);
    }
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Apakah Anda yakin ingin logout?", 
                                  "Peringatan", 
                                  JOptionPane.YES_NO_OPTION); 
            if (selectedOption == JOptionPane.YES_OPTION) 
            {
                this.dispose();;
            }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
            setdisabled();
            selectedKategori();
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - jPaneEdit.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - jPaneEdit.getHeight()) / 2);
            jPaneEdit.setLocation(x, y);
            this.jPaneEdit.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
            setdisabled();
            Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (int) ((dimension.getWidth() - jPaneRegister.getWidth()) / 2);
            int y = (int) ((dimension.getHeight() - jPaneRegister.getHeight()) / 2);
            jPaneRegister.setLocation(x, y);
            this.jPaneRegister.setVisible(true);
       
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Apakah Anda yakin ingin mengubah data member?", 
                                  "Peringatan", 
                                  JOptionPane.YES_NO_OPTION); 
            if (selectedOption == JOptionPane.YES_OPTION) 
            {
                con.insertKategori(jTextField1.getText(), jTextField7.getText());
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                this.jPaneRegister.setVisible(false);
                enablein();
                showTable();
            }
            
            else
            {
                
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            
                this.jPaneRegister.setVisible(false);
                enablein();
            
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Apakah Anda yakin ingin keluar?", 
                                  "Peringatan", 
                                  JOptionPane.YES_NO_OPTION); 
            if (selectedOption == JOptionPane.YES_OPTION) 
            {
                this.dispose();;
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Apakah Anda yakin ingin mengubah data member?", 
                                  "Peringatan", 
                                  JOptionPane.YES_NO_OPTION); 
            if (selectedOption == JOptionPane.YES_OPTION) 
            {
                con.editKategori((int) jTable2.getValueAt(Globaltemp, 0), jTextField2.getText(), jTextField10.getText());
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                this.jPaneEdit.setVisible(false);
                enablein();
                showTable();
            }
            
            else
            {
                
            }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
            
                this.jPaneEdit.setVisible(false);
                enablein();
            
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        if(jTextField3.getText().isEmpty()){
            showTable();
        }
        else{
            searchTableKategori(jTextField3.getText());
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
         if(jTextField3.getText().isEmpty()){
            showTable();
        }
        else{
            searchTableKategori(jTextField3.getText());
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
          if(jTextField3.getText().isEmpty()){
            showTable();
        }
        else{
            searchTableKategori(jTextField3.getText());
        }
    }//GEN-LAST:event_jTextField3KeyReleased

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
            java.util.logging.Logger.getLogger(FormKategoriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKategoriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKategoriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKategoriBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKategoriBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPaneEdit;
    private javax.swing.JPanel jPaneRegister;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
