package Pembukuan;

import static com.sun.webkit.perf.WCFontPerfLogger.reset;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// @author Van

public class inputDebetGUI extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    DefaultTableModel model; 
    String id;
 
    public inputDebetGUI() {
        initComponents();
        comboboxItem();
        String [] judul = {"No Pemasukan", "Tanggal", "Jenis Pemasukan", "Jenis Item", "Netto (Kg)","Nama Pemasukan","Jumlah Pemasukan (Rp)"};
        model = new DefaultTableModel (judul,0);
        jTable2.setModel(model);
        tampilkan ();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputItem = new javax.swing.JComboBox<>();
        inputJenisPemasukan = new javax.swing.JComboBox<>();
        inputNetto = new javax.swing.JTextField();
        inputNamaPemasukan = new javax.swing.JTextField();
        inputNominal = new javax.swing.JTextField();
        tombolTambah = new javax.swing.JButton();
        tambahItem = new javax.swing.JButton();
        inputTGL = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tombolUpdate = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        actionButton = new javax.swing.JMenu();
        inputButton = new javax.swing.JMenuItem();
        stokButton = new javax.swing.JMenuItem();
        rekapButton = new javax.swing.JMenuItem();
        hutangButton = new javax.swing.JMenuItem();
        optionButton = new javax.swing.JMenuItem();
        quitButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(363, 436));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input Debet");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));

        jLabel2.setText("2. Jenis Pemasukan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 181, -1));

        jLabel10.setText("3. Jenis Item");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 181, -1));

        jLabel4.setText("4. Netto (KG)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 36, 181, -1));

        jLabel5.setText("5. Nama Pemasukan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 85, 181, -1));

        jLabel6.setText("6. Jumlah Nominal (Rp)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 143, 181, -1));

        getContentPane().add(inputItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 181, -1));
        getContentPane().add(inputJenisPemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, 181, -1));
        getContentPane().add(inputNetto, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 54, 181, -1));
        getContentPane().add(inputNamaPemasukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 112, 181, -1));
        getContentPane().add(inputNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 163, 181, -1));

        tombolTambah.setText("Tambah");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });
        getContentPane().add(tombolTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        tambahItem.setText("Tambah Jenis Item");
        tambahItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahItemActionPerformed(evt);
            }
        });
        getContentPane().add(tambahItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 165, -1, -1));
        getContentPane().add(inputTGL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 181, -1));

        jLabel7.setText("1. Tanggal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, -1, -1));

        tombolUpdate.setText("Update");
        tombolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(tombolUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        tombolHapus.setText("Hapus");
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });
        getContentPane().add(tombolHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 73, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Title 6");
            jTable2.getColumnModel().getColumn(6).setHeaderValue("Title 7");
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 268, 590, 210));

        actionButton.setText("Action");

        inputButton.setText("Input");
        inputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputButtonActionPerformed(evt);
            }
        });
        actionButton.add(inputButton);

        stokButton.setText("Stok");
        stokButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokButtonActionPerformed(evt);
            }
        });
        actionButton.add(stokButton);

        rekapButton.setText("Rekap");
        rekapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekapButtonActionPerformed(evt);
            }
        });
        actionButton.add(rekapButton);

        hutangButton.setText("Hutang/Piutang");
        hutangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hutangButtonActionPerformed(evt);
            }
        });
        actionButton.add(hutangButton);

        optionButton.setText("option");
        optionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButtonActionPerformed(evt);
            }
        });
        actionButton.add(optionButton);

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        actionButton.add(quitButton);

        jMenuBar1.add(actionButton);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputButtonActionPerformed
        new debetKreditGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inputButtonActionPerformed

    private void stokButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokButtonActionPerformed
        new stokBarangGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stokButtonActionPerformed

    private void rekapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekapButtonActionPerformed
        new rekapGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rekapButtonActionPerformed

    private void hutangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hutangButtonActionPerformed
        new hutangGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hutangButtonActionPerformed

    private void optionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButtonActionPerformed
        new optionGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_optionButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void tambahItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahItemActionPerformed
        new TambahJenisItemGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tambahItemActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
      insertDB();
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUpdateActionPerformed
       updateDB();
    }//GEN-LAST:event_tombolUpdateActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        deleteDB();
    }//GEN-LAST:event_tombolHapusActionPerformed

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
            java.util.logging.Logger.getLogger(inputDebetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputDebetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputDebetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputDebetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputDebetGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu actionButton;
    private javax.swing.JMenuItem hutangButton;
    private javax.swing.JMenuItem inputButton;
    private javax.swing.JComboBox<String> inputItem;
    private javax.swing.JComboBox<String> inputJenisPemasukan;
    private javax.swing.JTextField inputNamaPemasukan;
    private javax.swing.JTextField inputNetto;
    private javax.swing.JTextField inputNominal;
    private com.toedter.calendar.JDateChooser inputTGL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem optionButton;
    private javax.swing.JMenuItem quitButton;
    private javax.swing.JMenuItem rekapButton;
    private javax.swing.JMenuItem stokButton;
    private javax.swing.JButton tambahItem;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolTambah;
    private javax.swing.JButton tombolUpdate;
    // End of variables declaration//GEN-END:variables

    private void comboboxItem() {
        try {            
          con= DriverManager.getConnection("jdbc:mysql://localhost/pembukuan_toko99", "root", "");
           String sql = "select * from daftarBarang";
           pst = con.prepareStatement(sql);
           rs = pst.executeQuery();
           while(rs.next())
           {
              String name = rs.getString("barang");
              inputItem.addItem(name);
           }
        } catch (SQLException e){
             JOptionPane.showMessageDialog(null, e);
            }
    }
    
    private void insertDB(){
         try {            
          SimpleDateFormat formatTgl = new SimpleDateFormat("yyyy-MM-dd");
          String tanggal = formatTgl.format(inputTGL.getDate());
          con= DriverManager.getConnection("jdbc:mysql://localhost/pembukuan_toko99", "root", "");
           con.createStatement().executeUpdate("INSERT INTO pemasukan"
            +"(tanggal,Nama_Pemasukan,Netto_Pemasukan,Jumlah_Pemasukan,Jenis_Item,Jenis_Pemasukan)"
            + "VALUES ('"+tanggal+"','"+inputNamaPemasukan.getText()+"','"+inputNetto.getText()+"','"+inputNominal.getText()+"','"+inputItem.getSelectedItem().toString()+"','"+inputJenisPemasukan.getSelectedItem().toString()+"')");
         JOptionPane.showMessageDialog(null, "Tambah Berhasil!");
         tampilkan();
         } catch (HeadlessException | SQLException e){
             JOptionPane.showMessageDialog(null, "Tambah Gagal!");
         }
         reset();
    }
    
    private void updateDB(){
        try {
          SimpleDateFormat formatTgl = new SimpleDateFormat("yyyy-MM-dd");
          String tanggal = formatTgl.format(inputTGL.getDate());
          con= DriverManager.getConnection("jdbc:mysql://localhost/pembukuan_toko99", "root", "");
          con.createStatement().executeUpdate("UPDATE pemasukan SET tanggal='"+tanggal+"',Nama_Pemasukan='"+inputNamaPemasukan.getText()+"',Jumlah_Pemasukan='"+inputNominal.getText()+"',Jenis_Item='"+inputItem.getSelectedItem().toString()+"',Jenis_Pemasukan='"+inputJenisPemasukan.getSelectedItem().toString()+"' where No_Pemasukan='"+id+"'");
          JOptionPane.showMessageDialog(null, "Ganti Berhasil!");    
        } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Ganti Gagal");
        }
    }
    
    private void deleteDB(){
        try {
          SimpleDateFormat formatTgl = new SimpleDateFormat("yyyy-MM-dd");
          String tanggal = formatTgl.format(inputTGL.getDate());
          con= DriverManager.getConnection("jdbc:mysql://localhost/pembukuan_toko99", "root", "");
          con.createStatement().executeUpdate("DELETE FROM pemasukan where No_Pemasukan='"+id+"'");
          JOptionPane.showMessageDialog(null, "Delete Berhasil");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Delete Gagal!");
        }
        
    }
    
       private void tampilkan() {
        int row =jTable2.getRowCount ();
        for (int a=0; a<row;a++){
            model.removeRow (0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/pembukuan_toko99", "root", "");
            ResultSet rSet = cn.createStatement ().executeQuery(" select * from pemasukan ");
            while (rSet.next()){
               String data[]={rSet.getString(1),rSet.getString(2),rSet.getString(7),rSet.getString(6),rSet.getString(4),rSet.getString(3),rSet.getString(5)};
               model.addRow (data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(inputKredit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
}
