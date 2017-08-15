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
import static storekeeper.SK12.removeButton;

/**
 *
 * @author Josh
 */
public class SK13 extends javax.swing.JPanel {
Connection conn = null;
ResultSet rs = null;
PreparedStatement ps = null;
    /**
     * Creates new form SK13
     */
    public SK13() {
        initComponents();
        removeButton(cmb_type);
        removeButton(cmb_description);
         try{
            conn = ConnectTESTING.Connect();
            String str3 = "select t_type  from pfmo.tool group by t_type;";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_type.addItem(rs.getString("t_type"));
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

        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmb_type = new javax.swing.JComboBox();
        cmb_description = new javax.swing.JComboBox();
        cmb_unit = new javax.swing.JComboBox();
        btn_replace = new javax.swing.JButton();

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Replacing Stock of Tools");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Tool Type:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel13.setText("Description:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText("Unit No.:");

        cmb_description.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_descriptionMouseClicked(evt);
            }
        });

        cmb_unit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_unitMouseClicked(evt);
            }
        });

        btn_replace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_replace.setText("REPLACE STOCK");
        btn_replace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_replace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_replaceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_description, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btn_replace, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(cmb_description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btn_replace)
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_descriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_descriptionMouseClicked
        cmb_description.removeAllItems();
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select t_desc  from pfmo.tool"
                    + " where t_type = '"+cmb_type.getSelectedItem()+"'; ";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_description.addItem(rs.getString("t_desc"));
            } 
        }
        catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cmb_descriptionMouseClicked

    private void cmb_unitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_unitMouseClicked
        cmb_unit.removeAllItems();
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select t_unit_no  from pfmo.tool_info"
                    + " where t_type = '"+cmb_type.getSelectedItem()+"'"
                    + " and t_desc = '"+cmb_description.getSelectedItem()+"' ; ";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_unit.addItem(rs.getString("t_unit_no"));
            } 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cmb_unitMouseClicked

    private void btn_replaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_replaceMouseClicked
        try{
            String str3 = "update pfmo.tool_unit"
                    + " set date_purchased = '"+getDateTime()+"'"
                    + " where t_unit_no = '"+cmb_unit.getSelectedItem()+"' ; ";
            ps = conn.prepareStatement(str3);
            ps.execute();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btn_replaceMouseClicked
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_replace;
    private javax.swing.JComboBox cmb_description;
    private javax.swing.JComboBox cmb_type;
    private javax.swing.JComboBox cmb_unit;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}