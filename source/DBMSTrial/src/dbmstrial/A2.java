/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dbmstrial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Christine Abbie
 */
public class A2 extends javax.swing.JFrame {
Connection conn = null;
ResultSet rs = null;
PreparedStatement ps = null;
    /**
     * Creates new form SE2
     */
    public A2() {
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
        USRlbl = new javax.swing.JLabel();
        ViewBylbl = new javax.swing.JLabel();
        txtToolType = new javax.swing.JTextField();
        BackMenubtn1 = new javax.swing.JButton();
        ViewBylbl1 = new javax.swing.JLabel();
        txtToolCode = new javax.swing.JTextField();
        ViewBylbl2 = new javax.swing.JLabel();
        ViewBylbl3 = new javax.swing.JLabel();
        cmb_tools = new javax.swing.JComboBox<>();
        ViewBylbl4 = new javax.swing.JLabel();
        txtToolDescription = new javax.swing.JTextField();
        BackMenubtn2 = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIII/LOG IN.jpg"))); // NOI18N
        jLabel1.setText("dfd");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1427, 724));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        USRlbl.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        USRlbl.setText("List of Tools");
        getContentPane().add(USRlbl);
        USRlbl.setBounds(560, 140, 84, 19);

        ViewBylbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ViewBylbl.setText("Tool Type:");
        getContentPane().add(ViewBylbl);
        ViewBylbl.setBounds(480, 280, 62, 17);
        getContentPane().add(txtToolType);
        txtToolType.setBounds(560, 180, 141, 20);

        BackMenubtn1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        BackMenubtn1.setText("ADD");
        BackMenubtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackMenubtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMenubtn1MouseClicked(evt);
            }
        });
        BackMenubtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenubtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(BackMenubtn1);
        BackMenubtn1.setBounds(550, 230, 86, 23);

        ViewBylbl1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ViewBylbl1.setText("Code:");
        getContentPane().add(ViewBylbl1);
        ViewBylbl1.setBounds(480, 340, 32, 17);
        getContentPane().add(txtToolCode);
        txtToolCode.setBounds(560, 340, 141, 20);

        ViewBylbl2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ViewBylbl2.setText("Tool Type:");
        getContentPane().add(ViewBylbl2);
        ViewBylbl2.setBounds(480, 180, 62, 17);

        ViewBylbl3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ViewBylbl3.setText("Tool Type:");
        getContentPane().add(ViewBylbl3);
        ViewBylbl3.setBounds(480, 180, 62, 17);

        getContentPane().add(cmb_tools);
        cmb_tools.setBounds(560, 280, 140, 20);

        ViewBylbl4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ViewBylbl4.setText("Description:");
        getContentPane().add(ViewBylbl4);
        ViewBylbl4.setBounds(480, 310, 68, 17);
        getContentPane().add(txtToolDescription);
        txtToolDescription.setBounds(560, 310, 141, 20);

        BackMenubtn2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        BackMenubtn2.setText("ADD");
        BackMenubtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackMenubtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMenubtn2MouseClicked(evt);
            }
        });
        BackMenubtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenubtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(BackMenubtn2);
        BackMenubtn2.setBounds(560, 380, 86, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMenubtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenubtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMenubtn1ActionPerformed

    private void BackMenubtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMenubtn1MouseClicked
        try{
            conn = ConnectTESTING.Connect();
            String str = "insert into pfmo.tool_type values ('"+txtToolType+"');";
            ps = conn.prepareStatement(str);
            ps.execute();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BackMenubtn1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void BackMenubtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMenubtn2MouseClicked
        if((txtToolDescription.getSelectedText().toString()!=null) && (txtToolCode.getSelectedText().toString()!=null)){
            try{
                conn = ConnectTESTING.Connect();
                String str = "insert into pfmo.tool_type values ('"+cmb_tools+"','"+txtToolDescription.getSelectedText().toString()+"',"
                + "'"+txtToolCode.getSelectedText().toString()+"')";
                ps = conn.prepareStatement(str);
               ps.execute();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        } else JOptionPane.showMessageDialog(null,"Enter values!");
    }//GEN-LAST:event_BackMenubtn2MouseClicked

    private void BackMenubtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenubtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackMenubtn2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         try{
             conn = ConnectTESTING.Connect();
            String str = "select t_type from pfmo.tool_type";
            ps = conn.prepareStatement(str);
             rs = ps.executeQuery();
        while(rs.next()){
            cmb_tools.addItem(rs.getString("t_type"));     
        } }catch (Exception e){
                JOptionPane.showMessageDialog(null,e);
                } 
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(A2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackMenubtn1;
    private javax.swing.JButton BackMenubtn2;
    private javax.swing.JLabel USRlbl;
    private javax.swing.JLabel ViewBylbl;
    private javax.swing.JLabel ViewBylbl1;
    private javax.swing.JLabel ViewBylbl2;
    private javax.swing.JLabel ViewBylbl3;
    private javax.swing.JLabel ViewBylbl4;
    private javax.swing.JComboBox<String> cmb_tools;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtToolCode;
    private javax.swing.JTextField txtToolDescription;
    private javax.swing.JTextField txtToolType;
    // End of variables declaration//GEN-END:variables
}