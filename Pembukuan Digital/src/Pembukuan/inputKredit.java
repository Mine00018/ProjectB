/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembukuan;

/**
 *
 * @author Claus
 */
public class inputKredit extends javax.swing.JFrame {

    /**
     * Creates new form inputKredit
     */
    public inputKredit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jenisItem = new javax.swing.JComboBox<>();
        jenisPengeluaran = new javax.swing.JComboBox<>();
        beratItem = new javax.swing.JTextField();
        namaKredit = new javax.swing.JTextField();
        nominalKredit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tambahItem = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        actionButton = new javax.swing.JMenu();
        inputButton = new javax.swing.JMenuItem();
        stokButton = new javax.swing.JMenuItem();
        rekapButton = new javax.swing.JMenuItem();
        hutangButton = new javax.swing.JMenuItem();
        optionButton = new javax.swing.JMenuItem();
        quitButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input Kredit");

        jLabel2.setText("1. Jenis Kredit");

        jLabel3.setText("2. Jenis Item");

        jLabel4.setText("3. Berat (Kg)");

        jLabel5.setText("4. Nama");

        jLabel6.setText("5. Jumlah Nominal (Rp)");

        jenisItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pala", "Kopra", "Cengkih", "Sirip Hiu", "Pribadi" }));

        jenisPengeluaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toko", "Kapal", "Lain-lain", "Overhead" }));

        jButton1.setText("OK");

        tambahItem.setText("Tambah Jenis Item");
        tambahItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahItemActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                            .addComponent(jenisPengeluaran, 0, 181, Short.MAX_VALUE)
                            .addComponent(jenisItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beratItem)
                            .addComponent(namaKredit)
                            .addComponent(nominalKredit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(tambahItem))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beratItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaKredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nominalKredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputButtonActionPerformed
        new inputGUI().setVisible(true);
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
        new optionGUI().setVisible(true);        
    }//GEN-LAST:event_tambahItemActionPerformed

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
            java.util.logging.Logger.getLogger(inputKredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputKredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputKredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputKredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputKredit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu actionButton;
    private javax.swing.JTextField beratItem;
    private javax.swing.JMenuItem hutangButton;
    private javax.swing.JMenuItem inputButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox<String> jenisItem;
    private javax.swing.JComboBox<String> jenisPengeluaran;
    private javax.swing.JTextField namaKredit;
    private javax.swing.JTextField nominalKredit;
    private javax.swing.JMenuItem optionButton;
    private javax.swing.JMenuItem quitButton;
    private javax.swing.JMenuItem rekapButton;
    private javax.swing.JMenuItem stokButton;
    private javax.swing.JButton tambahItem;
    // End of variables declaration//GEN-END:variables
}
