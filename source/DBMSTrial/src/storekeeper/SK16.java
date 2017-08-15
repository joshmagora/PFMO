/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storekeeper;

import dbmstrial.ConnectTESTING;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import sectionhead.SH12;

/**
 *
 * @author Josh
 */
public class SK16 extends javax.swing.JPanel {
Connection conn = null;
ResultSet rs = null;
PreparedStatement ps = null;
SK161 sk161;
    /**
     * Creates new form SK16
     */
    public SK16() {
        initComponents();
        tbl_bslip.repaint();
         try{
        conn = ConnectTESTING.Connect();
        String str = "select bslip_no,bslip_date from pfmo.bslip"
                + " where status_code = 'P';";
        ps = conn.prepareStatement(str);
        rs = ps.executeQuery();
        tbl_bslip.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bslip = new javax.swing.JTable();

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Approval of Borrowing Slip");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("List of Borrowing Slip");

        tbl_bslip.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbl_bslip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Slip No.", "B.S. Date"
            }
        ));
        tbl_bslip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bslipMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bslip);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    /* Open List of Tools Borrowed */
    private void tbl_bslipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bslipMouseClicked
        sk161 = new SK161();
        int index = tbl_bslip.getSelectedRow();
        TableModel model = tbl_bslip.getModel();
        
        String bslip = model.getValueAt(index, 0).toString();
        JOptionPane.showMessageDialog(null, bslip);
        sk161.slipNum = bslip;
        sk161.setVisible(true);
    }//GEN-LAST:event_tbl_bslipMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_bslip;
    // End of variables declaration//GEN-END:variables
}