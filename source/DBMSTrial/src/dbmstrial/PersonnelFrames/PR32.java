/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmstrial.PersonnelFrames;

import sectionhead.*;
import dbmstrial.ConnectTESTING;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Josh
 */
public class PR32 extends javax.swing.JFrame {
public String srNum = "";
Connection conn = null;
ResultSet rs = null;
PreparedStatement ps = null;
    /**
     * Creates new form SH22
     */
    public PR32() {
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

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_srNature = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_workers = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_srName = new javax.swing.JLabel();
        lbl_srDesignation = new javax.swing.JLabel();
        lbl_srOffice = new javax.swing.JLabel();
        lbl_srContact = new javax.swing.JLabel();
        lbl_peType = new javax.swing.JLabel();
        lbl_peDescription = new javax.swing.JLabel();
        lbl_peUnitNum = new javax.swing.JLabel();
        lbl_reqStatus = new javax.swing.JLabel();
        lbl_reqType = new javax.swing.JLabel();
        lbl_recommendation = new javax.swing.JLabel();
        lbl_targetDate = new javax.swing.JLabel();
        lbl_section = new javax.swing.JLabel();
        lbl_sectionHead = new javax.swing.JLabel();
        lbl_employeeNumber = new javax.swing.JLabel();
        lbl_srNum = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        jLabel11.setText("Unit Type:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1427, 724));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Work Order Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 140, 83, 14);

        jLabel2.setText("Service Request Number:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 170, 122, 14);

        jLabel3.setText("Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 190, 31, 14);

        jLabel4.setText("Designation:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 210, 60, 14);

        jLabel5.setText("Office/Department:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 230, 94, 14);

        jLabel6.setText("Contact Number:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 250, 82, 14);

        jLabel7.setText("Property Equipment");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(640, 170, 95, 14);

        jLabel8.setText("Type:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 190, 28, 14);

        jLabel9.setText("Description:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 210, 57, 14);

        jLabel10.setText("Unit Type:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(640, 230, 50, 14);

        jLabel12.setText("Nature of Request:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(440, 280, 93, 14);

        lbl_srNature.setEditable(false);
        getContentPane().add(lbl_srNature);
        lbl_srNature.setBounds(400, 300, 554, 89);

        jLabel13.setText("Request Status:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(290, 420, 78, 14);

        jLabel14.setText("Request Type:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(290, 440, 71, 14);

        jLabel15.setText("Recommendation:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(290, 460, 86, 14);

        jLabel16.setText("Target Date:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(290, 480, 62, 14);

        jLabel17.setText("Section:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(690, 420, 39, 14);

        jLabel18.setText("Section Head:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(690, 440, 67, 14);

        jLabel19.setText("Employee Number:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(690, 460, 90, 14);

        tbl_workers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_workers);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 490, 452, 92);

        jButton1.setText("Print Form");
        getContentPane().add(jButton1);
        jButton1.setBounds(850, 680, 81, 23);

        lbl_srName.setText(" ");
        getContentPane().add(lbl_srName);
        lbl_srName.setBounds(330, 190, 164, 14);

        lbl_srDesignation.setText(" ");
        getContentPane().add(lbl_srDesignation);
        lbl_srDesignation.setBounds(360, 210, 164, 14);

        lbl_srOffice.setText(" ");
        getContentPane().add(lbl_srOffice);
        lbl_srOffice.setBounds(390, 230, 164, 14);

        lbl_srContact.setText(" ");
        getContentPane().add(lbl_srContact);
        lbl_srContact.setBounds(380, 250, 164, 14);

        lbl_peType.setText(" ");
        getContentPane().add(lbl_peType);
        lbl_peType.setBounds(680, 190, 164, 14);

        lbl_peDescription.setText(" ");
        getContentPane().add(lbl_peDescription);
        lbl_peDescription.setBounds(700, 210, 164, 14);

        lbl_peUnitNum.setText(" ");
        getContentPane().add(lbl_peUnitNum);
        lbl_peUnitNum.setBounds(700, 230, 164, 14);

        lbl_reqStatus.setText(" ");
        getContentPane().add(lbl_reqStatus);
        lbl_reqStatus.setBounds(370, 420, 164, 14);

        lbl_reqType.setText(" ");
        getContentPane().add(lbl_reqType);
        lbl_reqType.setBounds(370, 440, 164, 14);

        lbl_recommendation.setText(" ");
        getContentPane().add(lbl_recommendation);
        lbl_recommendation.setBounds(380, 460, 164, 14);

        lbl_targetDate.setText(" ");
        getContentPane().add(lbl_targetDate);
        lbl_targetDate.setBounds(360, 480, 164, 14);

        lbl_section.setText(" ");
        getContentPane().add(lbl_section);
        lbl_section.setBounds(740, 420, 164, 14);

        lbl_sectionHead.setText(" ");
        getContentPane().add(lbl_sectionHead);
        lbl_sectionHead.setBounds(770, 440, 164, 14);

        lbl_employeeNumber.setText(" ");
        getContentPane().add(lbl_employeeNumber);
        lbl_employeeNumber.setBounds(790, 460, 164, 14);

        lbl_srNum.setText(" ");
        getContentPane().add(lbl_srNum);
        lbl_srNum.setBounds(420, 170, 164, 14);

        jButton2.setText("COMPLETE");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 630, 130, 23);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIII/LOG IN.jpg"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 0, 1390, 724);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       try{
        conn = ConnectTESTING.Connect();
        String str = "select * from pfmo.sr_info2 "+
		"where sr_no = '"+srNum+"'; ";
        ps = conn.prepareStatement(str);
        rs = ps.executeQuery();
        if(rs.next()){
            lbl_srNum.setText(srNum);
            lbl_srName.setText(rs.getString("Requestor"));
            lbl_srDesignation.setText(rs.getString("position_desc"));
            lbl_srOffice.setText(rs.getString("deptofc_code"));
            lbl_srContact.setText(rs.getString("contact_no"));
            lbl_peUnitNum.setText(rs.getString("pe_unit_no"));
            lbl_srNature.setText(rs.getString("nature_request"));
            lbl_recommendation.setText(rs.getString("rec_desc"));
            lbl_section.setText(rs.getString("section_desc"));
            lbl_reqStatus.setText((rs.getString("status_desc")));
            lbl_reqType.setText(rs.getString("rt_desc"));
        }
            String str2 = "select w.emp_no,concat(emp.emp_fname,' ',emp.emp_lname) as Name from pfmo.worker w "
                    + "inner join pfmo.employee emp "
                    + "on w.emp_no = emp.emp_no "
                    + "where sr_no = '"+srNum+"'; ";
            ps = conn.prepareStatement(str2);
            rs = ps.executeQuery();
            tbl_workers.setModel(DbUtils.resultSetToTableModel(rs));
       } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         int response = JOptionPane.showConfirmDialog(this,"Do you want to send this request?",
                  "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
        try{
                conn = ConnectTESTING.Connect();
                 String str = " update pfmo.service_request"
                    + " set status_code = 'C' "
                    + " where sr_no = '"+srNum+"'; ";
                ps = conn.prepareStatement(str);
                ps.execute();
                this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        } 
        } else JOptionPane.showMessageDialog(null, "Submitting request cancelled");
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(PR32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PR32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PR32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PR32.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PR32().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_employeeNumber;
    private javax.swing.JLabel lbl_peDescription;
    private javax.swing.JLabel lbl_peType;
    private javax.swing.JLabel lbl_peUnitNum;
    private javax.swing.JLabel lbl_recommendation;
    private javax.swing.JLabel lbl_reqStatus;
    private javax.swing.JLabel lbl_reqType;
    private javax.swing.JLabel lbl_section;
    private javax.swing.JLabel lbl_sectionHead;
    private javax.swing.JLabel lbl_srContact;
    private javax.swing.JLabel lbl_srDesignation;
    private javax.swing.JLabel lbl_srName;
    private javax.swing.JTextField lbl_srNature;
    private javax.swing.JLabel lbl_srNum;
    private javax.swing.JLabel lbl_srOffice;
    private javax.swing.JLabel lbl_targetDate;
    private javax.swing.JTable tbl_workers;
    // End of variables declaration//GEN-END:variables
}
