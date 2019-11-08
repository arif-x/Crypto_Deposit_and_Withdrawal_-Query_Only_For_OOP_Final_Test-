/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Deposit_Form extends javax.swing.JFrame {

    /**
     * Creates new form Deposit_Form
     */
    private DefaultTableModel tabmode;
    private ResultSet result;
    Deposit aa = new Deposit();
    Login bb = new Login();
    private String[] cryptotype = {"Choose One ...", "Bitcoin", "Ethereum", "Ripple", "Bitcoin Cash", "Dashcoin", "Litecoin"};
    private double valueOfAmount;
    private double valueOfEstimate;

    public Deposit_Form() {
        if (Session.getLoginStatus() == "Active") {
            initComponents();
            setSessionName();
            seeDatabase();
        } else {
            dispose();
            Login_Form form = new Login_Form();
            form.setVisible(true);
        }
    }

    private void setSessionName() {
        Name.setText("Welcome " + Session.getName());
    }

    public void setBTCWallet() {
        to.setText(Session.getBTCWallet());
    }

    public void setETHWallet() {
        to.setText(Session.getETHWallet());
    }

    public void setBCHWallet() {
        to.setText(Session.getBCHWallet());
    }

    public void setXRPWallet() {
        to.setText(Session.getXRPWallet());
    }

    public void setDASHWallet() {
        to.setText(Session.getDASHWallet());
    }

    public void setLTCWallet() {
        to.setText(Session.getLTCWallet());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tables = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        from = new javax.swing.JTextField();
        to = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        estimate = new javax.swing.JTextField();
        saveData = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        resetText = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        generate = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tables.setModel(new javax.swing.table.DefaultTableModel(
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
        tables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tables);

        jLabel1.setText("Crypto Type");

        jLabel3.setText("Received From");

        jLabel4.setText("Send to");

        jLabel5.setText("Amount");

        jLabel6.setText("Estimate");

        to.setEditable(false);
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });

        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountKeyReleased(evt);
            }
        });

        estimate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                estimateKeyReleased(evt);
            }
        });

        saveData.setText("Save");
        saveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataActionPerformed(evt);
            }
        });

        type.setModel(new javax.swing.DefaultComboBoxModel<>(cryptotype));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        resetText.setText("Reset");
        resetText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTextActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Name.setText("Name");
        Name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        generate.setText("Generate/Update Wallet");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        delete.setText("Delete History");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        txt_id.setText("Generated Automatically");
        txt_id.setEditable(false);

        jLabel2.setText("Transaction ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveData, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetText, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estimate, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estimate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveData)
                            .addComponent(resetText)
                            .addComponent(logout))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete)
                            .addComponent(generate)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void seeDatabase() {
        Object[] baris = {"Type", "Transaction ID", "From", "To", "Amount", "Estimate"};
        tabmode = new DefaultTableModel(null, baris);
        tables.setModel(tabmode);
        try {
            result = aa.seeData();
            while (result.next()) {
                aa.setType(result.getString("cryptotype"));
                aa.setTransactionID(result.getString("id"));
                aa.setReceiveFrom(result.getString("receivedfrom"));
                aa.setSendTo(result.getString("sendto"));
                aa.setAmount(result.getString("amount"));
                aa.setEstimate(result.getString("estimate"));
                String[] data = {aa.getType(), aa.getTransactionID(), aa.getReceiveFrom(), aa.getSendTo(), aa.getAmount(), aa.getEstimate()};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }

    public void reset_text() {
        from.setText("");
        to.setText("");
        amount.setText("");
        estimate.setText("");
    }

    private void saveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataActionPerformed
        if (from.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Data is not Full!");
            from.requestFocus();
        } else if (to.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Data is not Full!");
            to.requestFocus();
        } else if (amount.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Data is not Full!");
            amount.requestFocus();
        } else if (estimate.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Data is not Full!");
            estimate.requestFocus();
        } else {
            try {
                aa.setType(type.getSelectedItem().toString());
                aa.setReceiveFrom(from.getText());
                aa.setSendTo(to.getText());
                aa.setAmount(amount.getText());
                aa.setEstimate(estimate.getText());
                aa.saveData(aa.getType(), aa.getReceiveFrom(), aa.getSendTo(), aa.getAmount(), aa.getEstimate());
                JOptionPane.showMessageDialog(null, "Data Saved", "Information",
                        JOptionPane.INFORMATION_MESSAGE);
                seeDatabase();
                reset_text();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid Data", "Information",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveDataActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        if (type.getSelectedItem().equals("Bitcoin")) {
            to.setText("");
            setBTCWallet();
        } else if (type.getSelectedItem().equals("Ethereum")) {
            to.setText("");
            setETHWallet();
        } else if (type.getSelectedItem().equals("Bitcoin Cash")) {
            to.setText("");
            setBCHWallet();
        } else if (type.getSelectedItem().equals("Ripple")) {
            to.setText("");
            setXRPWallet();
        } else if (type.getSelectedItem().equals("Dashcoin")) {
            to.setText("");
            setDASHWallet();
        } else if (type.getSelectedItem().equals("Litecoin")) {
            to.setText("");
            setLTCWallet();
        } else {
            JOptionPane.showMessageDialog(null, "Please Fill One of Crypto Type");
        }
    }//GEN-LAST:event_typeActionPerformed

    private void resetTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTextActionPerformed
        reset_text();
    }//GEN-LAST:event_resetTextActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are You Sure to Logout?", "Warning", 2)
                == JOptionPane.YES_OPTION) {
            bb.logout(Session.getName());
            System.exit(0);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void estimateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estimateKeyReleased

    }//GEN-LAST:event_estimateKeyReleased

    private void amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyReleased
        valueOfAmount = Double.parseDouble(amount.getText());
        if (type.getSelectedItem() == "Bitcoin") {
            valueOfEstimate = valueOfAmount * 100000000;
            estimate.setText(String.valueOf(valueOfEstimate));
        } else if (type.getSelectedItem() == "Ethereum") {
            valueOfEstimate = valueOfAmount * 2000000;
            estimate.setText(String.valueOf(valueOfEstimate));
        } else if (type.getSelectedItem() == "Ripple") {
            valueOfEstimate = valueOfAmount * 4500;
            estimate.setText(String.valueOf(valueOfEstimate));
        } else if (type.getSelectedItem() == "Bitcoin Cash") {
            valueOfEstimate = valueOfAmount * 1500000;
            estimate.setText(String.valueOf(valueOfEstimate));
        } else if (type.getSelectedItem() == "Dashcoin") {
            valueOfEstimate = valueOfAmount * 1700000;
            estimate.setText(String.valueOf(valueOfEstimate));
        } else if (type.getSelectedItem() == "Litecoin") {
            valueOfEstimate = valueOfAmount * 1300000;
            estimate.setText(String.valueOf(valueOfEstimate));
        }
    }//GEN-LAST:event_amountKeyReleased

    private void tablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesMouseClicked
        try {
            int row = tables.rowAtPoint(evt.getPoint());
            String cryptoType = tables.getValueAt(row, 0).toString();
            String transactionID = tables.getValueAt(row, 1).toString();
            String receivedFrom = tables.getValueAt(row, 2).toString();
            String sendTo = tables.getValueAt(row, 3).toString();
            String totalAmount = tables.getValueAt(row, 4).toString();
            String totalEstimate = tables.getValueAt(row, 5).toString();
            txt_id.setText(String.valueOf(transactionID));
            type.getEditor().setItem(cryptoType);
            from.setText(String.valueOf(receivedFrom));
            to.setText(String.valueOf(sendTo));
            amount.setText(String.valueOf(totalAmount));
            estimate.setText(String.valueOf(totalEstimate));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tablesMouseClicked

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        if (type.getSelectedItem().equals("Ethereum")) {
            if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                    == JOptionPane.YES_OPTION) {
                aa.saveWalletETH(Session.getUserID());
                to.setText("");
                setETHWallet();
            }
        } else if (type.getSelectedItem().equals("Bitcoin")) {
            if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                    == JOptionPane.YES_OPTION) {
                aa.saveWalletBTC(Session.getUserID());
                to.setText("");
                setBTCWallet();
            }
        } else if (type.getSelectedItem().equals("Ripple")) {
            if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                    == JOptionPane.YES_OPTION) {
                aa.saveWalletXRP(Session.getUserID());
                to.setText("");
                setXRPWallet();
            }
        } else if (type.getSelectedItem().equals("Bitcoin Cash")) {
            if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                    == JOptionPane.YES_OPTION) {
                aa.saveWalletBCH(Session.getUserID());
                to.setText("");
                setBCHWallet();
            }
        } else if (type.getSelectedItem().equals("Dashcoin")) {
            if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                    == JOptionPane.YES_OPTION) {
                aa.saveWalletDASH(Session.getUserID());
                to.setText("");
                setDASHWallet();
            }
        } else if (type.getSelectedItem().equals("Litecoin")) {
            if (JOptionPane.showConfirmDialog(null, "Generate or Update Wallet?", "Warning", 2)
                    == JOptionPane.YES_OPTION) {
                aa.saveWalletLTC(Session.getUserID());
                to.setText("");
                setLTCWallet();
            }
        }
    }//GEN-LAST:event_generateActionPerformed

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed

    }//GEN-LAST:event_toActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (txt_id.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Sorry, Please Fill Transaction ID Correctly!");
            txt_id.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Are You Sure Delete This Transaction History?", "  Warning", 2) == JOptionPane.YES_OPTION) {
                try {
                    aa.setTransactionID(txt_id.getText());
                    aa.deleteHistory(aa.getTransactionID());
                    JOptionPane.showMessageDialog(null, "Transaction History Deleted", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                    seeDatabase();
                    reset_text();
                    txt_id.setText("Generated Automatically");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Transaction History Can't Deleted", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            Deposit_Form form = new Deposit_Form();
            form.setLocationRelativeTo(null);
            form.setVisible(true);
        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JTextField amount;
    private javax.swing.JButton delete;
    private javax.swing.JTextField estimate;
    private javax.swing.JTextField from;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton resetText;
    private javax.swing.JButton saveData;
    private javax.swing.JTable tables;
    private javax.swing.JTextField to;
    private javax.swing.JTextField txt_id;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}