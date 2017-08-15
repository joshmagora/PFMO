/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sectionhead;

import dbmstrial.ConnectTESTING;
import dbmstrial.SectionHead;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class SH12 extends javax.swing.JFrame {
public String srNum;
Connection conn = null;
ResultSet rs = null;
PreparedStatement ps = null;
SectionHead sh = new SectionHead();
    /**
     * Creates new form SH12
     */
    public SH12() {
        initComponents();
        cmb_workers1.setVisible(false);
        cmb_workers2.setVisible(false);
        cmb_workers3.setVisible(false);
        cmb_workers4.setVisible(false);
        cmb_workers5.setVisible(false);
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
        lbl_srNum = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_srName = new javax.swing.JLabel();
        lbl_srDesignation = new javax.swing.JLabel();
        lbl_srOffice = new javax.swing.JLabel();
        lbl_srContact = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_peType = new javax.swing.JLabel();
        lbl_peDescription = new javax.swing.JLabel();
        lbl_peUnitNum = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_srNature = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_numWorkers = new javax.swing.JTextField();
        cmb_workers1 = new javax.swing.JComboBox<>();
        cmb_workers2 = new javax.swing.JComboBox<>();
        cmb_workers3 = new javax.swing.JComboBox<>();
        cmb_workers4 = new javax.swing.JComboBox<>();
        cmb_workers5 = new javax.swing.JComboBox<>();
        btn_submit = new javax.swing.JButton();
        lbl_reqStatus = new javax.swing.JLabel();
        lbl_reqType = new javax.swing.JLabel();
        lbl_recommendation = new javax.swing.JLabel();
        lbl_targetDate = new javax.swing.JLabel();
        lbl_section = new javax.swing.JLabel();
        lbl_sectionHead = new javax.swing.JLabel();
        lbl_employeeNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Assigning of Workers");

        jLabel2.setText("Service Request Number:");

        jLabel3.setText("Name:");

        jLabel4.setText("Designation:");

        jLabel5.setText("Office/Department:");

        jLabel7.setText("Contact Number:");

        lbl_srName.setText(" ");

        lbl_srDesignation.setText(" ");

        lbl_srOffice.setText(" ");

        lbl_srContact.setText(" ");

        jLabel8.setText("Property Equipment");

        jLabel9.setText("Type:");

        jLabel10.setText("Description:");

        jLabel11.setText("Unit No.:");

        lbl_peType.setText(" ");

        lbl_peDescription.setText(" ");

        lbl_peUnitNum.setText(" ");

        jLabel6.setText("Nature of Request:");

        lbl_srNature.setEditable(false);

        jLabel12.setText("Request Status:");

        jLabel13.setText("Request Type:");

        jLabel14.setText("Rcommendation:");

        jLabel15.setText("Target Date:");

        jLabel16.setText("Section:");

        jLabel17.setText("Section Head:");

        jLabel18.setText("Employee Number:");

        jLabel19.setText("Enter no. of workers to be assigned in this project:");

        txt_numWorkers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numWorkersActionPerformed(evt);
            }
        });

        btn_submit.setText("Submit");
        btn_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_submitMouseClicked(evt);
            }
        });

        lbl_reqStatus.setText(" ");

        lbl_reqType.setText(" ");

        lbl_recommendation.setText(" ");

        lbl_targetDate.setText(" ");

        lbl_section.setText(" ");

        lbl_sectionHead.setText(" ");

        lbl_employeeNumber.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_srNum, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_srDesignation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_srOffice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_srContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_srName, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_peUnitNum, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_peDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_peType, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_workers2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_workers1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_workers3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_workers4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_workers5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_submit)
                            .addComponent(txt_numWorkers, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_reqStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_targetDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_reqType, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_recommendation, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_employeeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_sectionHead, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_section, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_srNature, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_srNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_srName)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_srDesignation)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_peType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_srOffice)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_peDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_srContact)
                    .addComponent(lbl_peUnitNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_srNature, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_reqStatus)
                    .addComponent(lbl_section))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_reqType)
                    .addComponent(lbl_sectionHead))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_recommendation)
                    .addComponent(lbl_employeeNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_targetDate))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_numWorkers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(cmb_workers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_workers2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_workers3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_workers4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_workers5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_submit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try{
            lbl_srNum.setText(srNum);
        conn = ConnectTESTING.Connect();
                 String str = "select * from pfmo.sr_info2 "+
		"where sr_no = '"+srNum+"'; ";
                ps = conn.prepareStatement(str);
                rs = ps.executeQuery();
                if(rs.next()){
                    lbl_srName.setText(rs.getString("Requestor"));
                    lbl_srDesignation.setText(rs.getString("position_desc"));
                    lbl_srOffice.setText(rs.getString("deptofc_code"));
                    lbl_srContact.setText(rs.getString("contact_no"));
                    lbl_peUnitNum.setText(rs.getString("pe_unit_no"));
                    lbl_peDescription.setText(rs.getString("pe_desc"));
                    lbl_peType.setText(rs.getString("pe_type"));
                    lbl_srNature.setText(rs.getString("nature_request"));
                    lbl_recommendation.setText(rs.getString("rec_desc"));
                    lbl_section.setText(rs.getString("section_desc"));
                    lbl_reqStatus.setText((rs.getString("status_desc")));
                    lbl_reqType.setText(rs.getString("rt_desc"));
                    lbl_targetDate.setText(rs.getString("target_date"));
                    lbl_employeeNumber.setText(rs.getString("emp_no"));
                    lbl_sectionHead.setText(rs.getString("Employee"));
                }
        String str6 = "select concat(emp_lname,', ',emp_fname) as Name from pfmo.employee"
                + " where position_code = 'W'";
        ps = conn.prepareStatement(str6);
        rs = ps.executeQuery();
        while(rs.next()){
            cmb_workers1.addItem(rs.getString("Name"));
            cmb_workers2.addItem(rs.getString("Name"));
            cmb_workers3.addItem(rs.getString("Name"));
            cmb_workers4.addItem(rs.getString("Name"));
            cmb_workers5.addItem(rs.getString("Name"));
        }
    
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void txt_numWorkersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numWorkersActionPerformed
        if(txt_numWorkers.getText().equals("0")){
            cmb_workers1.setVisible(false);
            cmb_workers2.setVisible(false);
            cmb_workers3.setVisible(false);
            cmb_workers4.setVisible(false);
            cmb_workers5.setVisible(false);
        }
        if(txt_numWorkers.getText().equals("1")){
            cmb_workers1.setVisible(true);
            cmb_workers2.setVisible(false);
            cmb_workers3.setVisible(false);
            cmb_workers4.setVisible(false);
            cmb_workers5.setVisible(false);
        }
        if(txt_numWorkers.getText().equals("2")){
            cmb_workers1.setVisible(true);
            cmb_workers2.setVisible(true);
            cmb_workers3.setVisible(false);
            cmb_workers4.setVisible(false);
            cmb_workers5.setVisible(false);
        }
        if(txt_numWorkers.getText().equals("3")){
            cmb_workers1.setVisible(true);
            cmb_workers2.setVisible(true);
            cmb_workers3.setVisible(true);
            cmb_workers4.setVisible(false);
            cmb_workers5.setVisible(false);
        }
        if(txt_numWorkers.getText().equals("4")){
            cmb_workers1.setVisible(true);
            cmb_workers2.setVisible(true);
            cmb_workers3.setVisible(true);
            cmb_workers4.setVisible(true);
            cmb_workers5.setVisible(false);
        }
        if(txt_numWorkers.getText().equals("5")){
            cmb_workers1.setVisible(true);
            cmb_workers2.setVisible(true);
            cmb_workers3.setVisible(true);
            cmb_workers4.setVisible(true);
            cmb_workers5.setVisible(true);
        }
    }//GEN-LAST:event_txt_numWorkersActionPerformed

    private void btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_submitMouseClicked
        conn = ConnectTESTING.Connect();
        int response = JOptionPane.showConfirmDialog(this,"Do you want to send this request?",
                  "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
            try{
                    String str3 = "update pfmo.service_request"
                    + " set active = '2'"
                    + " where sr_no = '"+srNum+"'; ";
                    ps = conn.prepareStatement(str3);
                    ps.execute();
            for(int i = 0; i<Integer.parseInt(txt_numWorkers.getText()); i++){
            if(i == 0){
                String str = "select emp_no from pfmo.employee"
                        + " where concat(emp_lname,', ',emp_fname) like '%"+cmb_workers1.getSelectedItem()+"%'; ";
                ps = conn.prepareStatement(str);
                rs = ps.executeQuery();
                if(rs.next()){
                    String str1 = "insert into pfmo.worker values ("
                            + " '"+srNum+"','"+rs.getString("emp_no")+"','1');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();
                }} if(i == 1){
                String str = "select emp_no from pfmo.employee"
                        + " where concat(emp_lname,', ',emp_fname) like '%"+cmb_workers2.getSelectedItem()+"%'; ";
                ps = conn.prepareStatement(str);
                rs = ps.executeQuery();
                if(rs.next()){
                    String str1 = "insert into pfmo.worker values ("
                            + " '"+srNum+"','"+rs.getString("emp_no")+"','1');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();
                }
            }  if(i == 2){
                String str = "select emp_no from pfmo.employee"
                        + " where concat(emp_lname,', ',emp_fname) like '%"+cmb_workers3.getSelectedItem()+"%'; ";
                ps = conn.prepareStatement(str);
                rs = ps.executeQuery();
                if(rs.next()){
                    String str1 = "insert into pfmo.worker values ("
                            + " '"+srNum+"','"+rs.getString("emp_no")+"','1');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();
                }
            } if(i == 3){
                String str = "select emp_no from pfmo.employee"
                        + " where concat(emp_lname,', ',emp_fname) like '%"+cmb_workers4.getSelectedItem()+"%'; ";
                ps = conn.prepareStatement(str);
                rs = ps.executeQuery();
                if(rs.next()){
                    String str1 = "insert into pfmo.worker values ("
                            + " '"+srNum+"','"+rs.getString("emp_no")+"','1');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();
                }
            } if(i == 4){
                String str = "select emp_no from pfmo.employee"
                        + " where concat(emp_lname,', ',emp_fname) like '%"+cmb_workers5.getSelectedItem()+"%'; ";
                ps = conn.prepareStatement(str);
                rs = ps.executeQuery();
                if(rs.next()){
                   String str1 = "insert into pfmo.worker values ("
                            + " '"+srNum+"','"+rs.getString("emp_no")+"','1');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();
                }
            }                          
        }
            JOptionPane.showMessageDialog(null, "Successful");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
        } else JOptionPane.showMessageDialog(null, "Submitting request cancelled");
    }//GEN-LAST:event_btn_submitMouseClicked

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
            java.util.logging.Logger.getLogger(SH12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SH12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SH12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SH12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SH12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cmb_workers1;
    private javax.swing.JComboBox<String> cmb_workers2;
    private javax.swing.JComboBox<String> cmb_workers3;
    private javax.swing.JComboBox<String> cmb_workers4;
    private javax.swing.JComboBox<String> cmb_workers5;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField txt_numWorkers;
    // End of variables declaration//GEN-END:variables
}