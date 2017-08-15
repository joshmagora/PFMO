/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storekeeper;

import dbmstrial.ConnectTESTING;
import java.awt.Component;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class SK22 extends javax.swing.JPanel {
Connection conn = null;
ResultSet rs = null;
PreparedStatement ps = null;
    /**
     * Creates new form SK22
     */
    public SK22() {
        initComponents();
        removeButton(cmb_type);
        removeButton(cmb_desc);
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select m_type  from pfmo.material group by m_type;";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_type.addItem(rs.getString("m_type"));
            } 
        }
        catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
    }

    public static void removeButton(Container container){
        Component[] components = container.getComponents();
        for (Component component : components){
            if(component instanceof AbstractButton){
                container.remove(component);
            }
        }
    }
    
    public String getDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return dateFormat.format(date);            
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmb_type = new javax.swing.JComboBox();
        cmb_desc = new javax.swing.JComboBox();
        txt_quan = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Adding Stock of Materials");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Material Type:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("Description:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("Quantity:");

        cmb_desc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_descMouseClicked(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("ADD STOCK");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_quan)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel12)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(cmb_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_quan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_descMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_descMouseClicked
       cmb_desc.removeAllItems();
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select m_desc  from pfmo.material"
                    + " where m_type = '"+cmb_type.getSelectedItem()+"'; ";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_desc.addItem(rs.getString("m_desc"));
            } 
        }
        catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cmb_descMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        String type="";
        int response = JOptionPane.showConfirmDialog(this,"Do you want to send this request?",
                  "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
            try{
                conn = ConnectTESTING.Connect();
                String str1 = "select m_code from pfmo.material"
                        + " where m_desc = '"+cmb_desc.getSelectedItem().toString()+"'"
                        + " and m_type = '"+cmb_type.getSelectedItem().toString()+"'; ";
                 ps = conn.prepareStatement(str1);
                 rs = ps.executeQuery();
                 if(rs.next()) type = rs.getString("m_code");
                String str = "insert into pfmo.material_code values("
                        + "'"+type+"',"
                        + " '"+txt_quan.getText()+"', '"+getDateTime()+"');" ;
                ps = conn.prepareStatement(str);
                ps.execute();
              JOptionPane.showMessageDialog(null,"Submitting request was successful");
              cmb_desc.removeAllItems();
              txt_quan.setText("");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,e );
            }
        } else JOptionPane.showMessageDialog(null, "Submitting request cancelled");
    }//GEN-LAST:event_btnAddMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox cmb_desc;
    private javax.swing.JComboBox cmb_type;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_quan;
    // End of variables declaration//GEN-END:variables
}
