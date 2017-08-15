/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storekeeper;

import dbmstrial.ConnectTESTING;
import dbmstrial.MessgeRequest;
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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Josh
 */
public class SK162 extends javax.swing.JFrame {
public String type,desc,borrow,quantity;
Connection conn = null;
ResultSet rs = null;
PreparedStatement ps = null;
    /**
     * Creates new form SK162
     */
    public SK162() {
        initComponents();
        removeButton(cmb_unitNum);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        lbl_desc = new javax.swing.JLabel();
        cmb_unitNum = new javax.swing.JComboBox<>();
        btn_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Type");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Description");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Unit Number");

        lbl_type.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbl_type.setText("List of Tools");

        lbl_desc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbl_desc.setText("List of Tools");

        btn_submit.setText("SUBMIT");
        btn_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_submitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_unitNum, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbl_desc))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_type))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_type))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_desc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_unitNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_submit, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lbl_type.setText(type);
        lbl_desc.setText(desc);
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select t.t_unit_no  from pfmo.tool_unit t"
                    + " inner join pfmo.tool too"
                    + " on t.t_code = too.t_code"
                    + " where too.t_type = '"+type+"'"
                    + " and too.t_desc = '"+desc+"'"
                    + " and t.status_code = 'A'"
                    + " group by t.t_unit_no ;";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_unitNum.addItem(rs.getString("t.t_unit_no"));
            } 
        }
        catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_submitMouseClicked
        String code = "";
        try{
            String str1 = "insert into pfmo.tool_borrowed values ("
                    + "'"+borrow+"',"
                    + "'"+cmb_unitNum.getSelectedItem().toString()+"',"
                    + "'NA','"+getDateTime()+"')";
            ps = conn.prepareStatement(str1);
            ps.execute();
            String str3 = "select t_code  from pfmo.tool"
                    + " where t_type = '"+type+"'"
                    + " and t_desc = '"+desc+"' ;";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            if(rs.next()) code = rs.getString("t_code");
            int qnty = Integer.parseInt(quantity)-1;
            String str2 = "update pfmo.bslip_details"
                    + " set quantity = '"+String.valueOf(qnty)+"'"
                    + " where borrow_id = '"+borrow+"' and t_code = '"+code+"' ";
            ps = conn.prepareStatement(str2);
            ps.execute();
            String str4 = "update pfmo.tool_unit"
                    + " set status_code = 'NA'"
                    + " where t_unit_no = '"+cmb_unitNum.getSelectedItem().toString()+"';";
            ps = conn.prepareStatement(str4);
            ps.execute();
            this.dispose();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_submitMouseClicked
    
     public String getDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);            
    }
     public static void removeButton(Container container){
        Component[] components = container.getComponents();
        for (Component component : components){
            if(component instanceof AbstractButton){
                container.remove(component);
            }
        }
    }
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
            java.util.logging.Logger.getLogger(SK162.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SK162.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SK162.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SK162.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SK162().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cmb_unitNum;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_desc;
    private javax.swing.JLabel lbl_type;
    // End of variables declaration//GEN-END:variables
}