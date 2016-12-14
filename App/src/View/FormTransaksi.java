/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import Controller.*;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author Andreas Aldito
 */
public class FormTransaksi extends javax.swing.JFrame implements SwingConstants
{
    private controller con = new controller();
    /**
     * Creates new form Transaksi
     */
    public FormTransaksi() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        jLabel4.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setVisible(true);
        this.setResizable(false);
        //this.setAlwaysOnTop(true);
        this.jPanel1.setOpaque(false);
        this.jPanel2.setOpaque(false);
        this.jPanel3.setOpaque(false);
        this.jButton3.setBorderPainted(true);
        cmb_Id_Barang.setSelectedItem("");
        jButton6.setVisible(false);
        jPaneRegister.setVisible(false);
        con.getAll();
        setID_Barang();
        
    }
    
      private void setdisabled()
    {
        this.cmb_Id_Barang.setEnabled(false);
        this.txtBarang.setEnabled(false);
        this.jTextField9.setEnabled(false);
        this.jButton3.setEnabled(false);
        this.jButton11.setEnabled(false);
        this.jButton10.setEnabled(false);
        this.jButton5.setEnabled(false);
        this.jButton8.setEnabled(false);
        this.jButton4.setEnabled(false);
        this.jButton9.setEnabled(false);
        this.jButton7.setEnabled(false);
        jTable1.getTableHeader().setEnabled(false);
    }
    
    private void enablein()
    {
        this.cmb_Id_Barang.setEnabled(true);
        this.txtBarang.setEnabled(true);
        this.jTextField9.setEnabled(true);
        this.jButton3.setEnabled(true);
        this.jButton11.setEnabled(true);
        this.jButton10.setEnabled(true);
        this.jButton5.setEnabled(true);
        this.jButton8.setEnabled(true);
        this.jButton4.setEnabled(true);
        this.jButton9.setEnabled(true);
        this.jButton7.setEnabled(true);
        jTable1.getTableHeader().setEnabled(true);
    }
    
    private void setID_Barang(){
       int i=0;
       for(i=0;i<con.getDummyBarang().size();i++){
           cmb_Id_Barang.addItem(con.getDummyBarang().get(i).getId_barang());
       }
       
    }
    
    private void setBarangByID(){
        txtBarang.setText(con.getBarangByID(Integer.parseInt(cmb_Id_Barang.getSelectedItem().toString())));
    }
    
    private void searchID_Barang(int key){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton7 = new javax.swing.JButton();
        jPaneRegister = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBarang = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cmb_Id_Barang = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

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
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Computer-Hardware-Shutdown-icon.png"))); // NOI18N
        jButton7.setText("Keluar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(30, 680, 100, 40);

        jPaneRegister.setBackground(new java.awt.Color(250, 205, 138));
        jPaneRegister.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPaneRegister.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel9.setText("Register Member Baru");
        jPaneRegister.add(jLabel9);
        jLabel9.setBounds(30, 10, 239, 35);
        jPaneRegister.add(jTextField1);
        jTextField1.setBounds(20, 60, 261, 30);

        jLabel10.setText("Alamat");
        jPaneRegister.add(jLabel10);
        jLabel10.setBounds(20, 90, 160, 14);

        jLabel13.setText("No. Telp");
        jPaneRegister.add(jLabel13);
        jLabel13.setBounds(20, 170, 170, 14);
        jPaneRegister.add(jTextField4);
        jTextField4.setBounds(20, 190, 261, 30);

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
        jTextField7.setBounds(20, 110, 261, 60);

        jLabel14.setText("Nama Member");
        jPaneRegister.add(jLabel14);
        jLabel14.setBounds(20, 40, 190, 14);

        getContentPane().add(jPaneRegister);
        jPaneRegister.setBounds(410, 440, 300, 270);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Add-user-icon.png"))); // NOI18N
        jButton11.setText("Register Member");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(30, 380, 200, 40);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/delete_converted.png"))); // NOI18N
        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(960, 650, 123, 52);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/edit_converted.png"))); // NOI18N
        jButton10.setText("Edit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(830, 650, 123, 52);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/cancel_converted.png"))); // NOI18N
        jButton4.setText("Batal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1220, 650, 123, 52);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/Cash-Register-icon.png"))); // NOI18N
        jButton8.setText("Bayar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1090, 650, 123, 52);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Jumlah", "Harga"
            }
        ));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 250, 1048, 350);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(297, 138, 1048, 2);

        jLabel3.setText("ID Barang");

        jLabel6.setText("Nama Barang");

        jLabel7.setText("Qty");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/add_converted.png"))); // NOI18N
        jButton3.setText("Tambah");
        jButton3.setBorderPainted(false);

        cmb_Id_Barang.setEditable(true);
        cmb_Id_Barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_Id_BarangActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/save-icon.png"))); // NOI18N
        jButton6.setText("Simpan");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmb_Id_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(cmb_Id_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(300, 170, 720, 70);

        jLabel1.setText("No Transaksi");

        jLabel2.setText("Set No Transaksi Here");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(91, 91, 91))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(297, 11, 418, 121);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setText("Total");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 0));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Verdana", 1, 52)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setText("0");
        jTextField3.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rp");
        jLabel8.setPreferredSize(new java.awt.Dimension(31, 58));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(766, 10, 580, 120);

        jLabel11.setText("Nama User");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(51, 236, 210, 117);

        jLabel12.setText("Nomor_Kasir");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(51, 163, 210, 67);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Login-out-icon.png"))); // NOI18N
        jButton9.setText("Logout");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(30, 620, 100, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/bckgrnd2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1420, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        FormLogin fl = new FormLogin();
        fl.show();
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cmb_Id_BarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_Id_BarangActionPerformed
        // TODO add your handling code here:
        if(!cmb_Id_Barang.getSelectedItem().toString().equalsIgnoreCase("")){
            setBarangByID();
        }
    }//GEN-LAST:event_cmb_Id_BarangActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah Anda yakin ingin mengedit item tersebut?",
            "Peringatan",
            JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION)
        {
            this.jButton6.setVisible(true);
            this.jButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah Anda Yakin ingin menghapus entri tersebut?",
            "Peringatan",
            JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Data telah dihapus");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int x=1;
        String bayar = JOptionPane.showInputDialog(null,"Bayar");

        if(bayar == null || (bayar != null && ("".equals(bayar))))
        {
            JOptionPane.showMessageDialog(null, "Pembayaran telah dibatalkan");
            x=0;
        }

        if(x!=0)
        {
            int selectedOption = JOptionPane.showConfirmDialog(null,
                "Apakah Anda Memiliki Kartu Member?",
                "Member",
                JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_OPTION)
            {
                String member = JOptionPane.showInputDialog(null,"ID Member");
                JOptionPane.showMessageDialog(null, "Poin member sukses ditambahkan");
            }
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah Anda yakin ingin membatalkan transaksi?",
            "Peringatan",
            JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Transaksi telah dibatalkan");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, "Data item berhasil diedit");

        this.jButton3.setEnabled(true);
        this.jButton6.setVisible(false);

    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah Anda yakin ingin menambahkan member baru?",
            "Peringatan",
            JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            this.jPaneRegister.setVisible(false);
            enablein();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        this.jPaneRegister.setVisible(false);
        enablein();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        setdisabled();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - jPaneRegister.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - jPaneRegister.getHeight()) / 2);
        jPaneRegister.setLocation(x, y);
        this.jPaneRegister.setVisible(true);

    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb_Id_Barang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPaneRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtBarang;
    // End of variables declaration//GEN-END:variables
}
