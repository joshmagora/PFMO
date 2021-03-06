/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sectionhead;

import dbmstrial.ConnectTESTING;
import dbmstrial.SectionHead;
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
import static sectionhead.SH61.removeButton;

/**
 *
 * @author Josh
 */
public class SH71 extends javax.swing.JFrame {
Connection conn = null;
ResultSet rs = null;
PreparedStatement ps = null;
SectionHead sh;
String username = null;
    /**
     * Creates new form SH71
     */
    public SH71() {
        initComponents();
        removeButton(cmb_type1);
        removeButton(cmb_type2);
        removeButton(cmb_type3);
        removeButton(cmb_type4);
        removeButton(cmb_type5);
        removeButton(cmb_description1);
        removeButton(cmb_description2);
        removeButton(cmb_description3);
        removeButton(cmb_description4);
        removeButton(cmb_description5);
            
        cmb_type1.setVisible(false);
        cmb_type2.setVisible(false);
        cmb_type3.setVisible(false);
        cmb_type4.setVisible(false);
        cmb_type5.setVisible(false);
        cmb_description1.setVisible(false);
        cmb_description2.setVisible(false);
        cmb_description3.setVisible(false);
        cmb_description4.setVisible(false);
        cmb_description5.setVisible(false);
        txt_quantity1.setVisible(false);
        txt_quantity2.setVisible(false);
        txt_quantity3.setVisible(false);
        txt_quantity4.setVisible(false);
        txt_quantity5.setVisible(false);
        btn_submit.setVisible(false);
        sh = new SectionHead();
        username = sh.username;
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
        jLabel1 = new javax.swing.JLabel();
        txt_numTools = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmb_type1 = new javax.swing.JComboBox<>();
        cmb_type2 = new javax.swing.JComboBox<>();
        cmb_type3 = new javax.swing.JComboBox<>();
        cmb_type4 = new javax.swing.JComboBox<>();
        cmb_type5 = new javax.swing.JComboBox<>();
        cmb_description5 = new javax.swing.JComboBox<>();
        cmb_description4 = new javax.swing.JComboBox<>();
        cmb_description3 = new javax.swing.JComboBox<>();
        cmb_description2 = new javax.swing.JComboBox<>();
        cmb_description1 = new javax.swing.JComboBox<>();
        txt_quantity1 = new javax.swing.JTextField();
        txt_quantity2 = new javax.swing.JTextField();
        txt_quantity3 = new javax.swing.JTextField();
        txt_quantity4 = new javax.swing.JTextField();
        txt_quantity5 = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Acquiring Slip");

        jLabel1.setText("Enter number of tools:");

        txt_numTools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numToolsActionPerformed(evt);
            }
        });

        jLabel2.setText("(Max 5 every transaction)");

        cmb_description5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_description5MouseClicked(evt);
            }
        });

        cmb_description4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_description4MouseClicked(evt);
            }
        });

        cmb_description3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_description3MouseClicked(evt);
            }
        });

        cmb_description2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_description2MouseClicked(evt);
            }
        });

        cmb_description1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_description1MouseClicked(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(txt_numTools, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_type1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cmb_description1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_type2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cmb_description2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_type3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cmb_description3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_type4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cmb_description4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_type5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(cmb_description5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btn_submit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_numTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_type1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_description1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_type2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_description2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_type3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_description3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_type4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_description4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_type5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_description5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_quantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_quantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_quantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btn_submit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numToolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numToolsActionPerformed
        if(Integer.parseInt(txt_numTools.getText()) == 1){
            cmb_type1.setVisible(true);
            cmb_type2.setVisible(false);
            cmb_type3.setVisible(false);
            cmb_type4.setVisible(false);
            cmb_type5.setVisible(false);
            cmb_description1.setVisible(true);
            cmb_description2.setVisible(false);
            cmb_description3.setVisible(false);
            cmb_description4.setVisible(false);
            cmb_description5.setVisible(false);
            txt_quantity1.setVisible(true);
            txt_quantity2.setVisible(false);
            txt_quantity3.setVisible(false);
            txt_quantity4.setVisible(false);
            txt_quantity5.setVisible(false);
            btn_submit.setVisible(true);
        } else if(Integer.parseInt(txt_numTools.getText()) == 2){
            cmb_type1.setVisible(true);
            cmb_type2.setVisible(true);
            cmb_type3.setVisible(false);
            cmb_type4.setVisible(false);
            cmb_type5.setVisible(false);
            cmb_description1.setVisible(true);
            cmb_description2.setVisible(true);
            cmb_description3.setVisible(false);
            cmb_description4.setVisible(false);
            cmb_description5.setVisible(false);
            txt_quantity1.setVisible(true);
            txt_quantity2.setVisible(true);
            txt_quantity3.setVisible(false);
            txt_quantity4.setVisible(false);
            txt_quantity5.setVisible(false);
            btn_submit.setVisible(true);
        } else if(Integer.parseInt(txt_numTools.getText()) == 3){
            cmb_type1.setVisible(true);
            cmb_type2.setVisible(true);
            cmb_type3.setVisible(true);
            cmb_type4.setVisible(false);
            cmb_type5.setVisible(false);
            cmb_description1.setVisible(true);
            cmb_description2.setVisible(true);
            cmb_description3.setVisible(true);
            cmb_description4.setVisible(false);
            cmb_description5.setVisible(false);
            txt_quantity1.setVisible(true);
            txt_quantity2.setVisible(true);
            txt_quantity3.setVisible(true);
            txt_quantity4.setVisible(false);
            txt_quantity5.setVisible(false);
            btn_submit.setVisible(true);
        } else if(Integer.parseInt(txt_numTools.getText()) == 4){
            cmb_type1.setVisible(true);
            cmb_type2.setVisible(true);
            cmb_type3.setVisible(true);
            cmb_type4.setVisible(true);
            cmb_type5.setVisible(false);
            cmb_description1.setVisible(true);
            cmb_description2.setVisible(true);
            cmb_description3.setVisible(true);
            cmb_description4.setVisible(true);
            cmb_description5.setVisible(false);
            txt_quantity1.setVisible(true);
            txt_quantity2.setVisible(true);
            txt_quantity3.setVisible(true);
            txt_quantity4.setVisible(true);
            txt_quantity5.setVisible(false);
            btn_submit.setVisible(true);
        } else if(Integer.parseInt(txt_numTools.getText()) == 5){
            cmb_type1.setVisible(true);
            cmb_type2.setVisible(true);
            cmb_type3.setVisible(true);
            cmb_type4.setVisible(true);
            cmb_type5.setVisible(true);
            cmb_description1.setVisible(true);
            cmb_description2.setVisible(true);
            cmb_description3.setVisible(true);
            cmb_description4.setVisible(true);
            cmb_description5.setVisible(true);
            txt_quantity1.setVisible(true);
            txt_quantity2.setVisible(true);
            txt_quantity3.setVisible(true);
            txt_quantity4.setVisible(true);
            txt_quantity5.setVisible(true);
            btn_submit.setVisible(true);
        }

    }//GEN-LAST:event_txt_numToolsActionPerformed

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
    
    private void cmb_description5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_description5MouseClicked
        cmb_description5.removeAllItems();
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select m_desc  from pfmo.material"
            + " where m_type = '"+cmb_type5.getSelectedItem()+"'; ";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_description5.addItem(rs.getString("m_desc"));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cmb_description5MouseClicked

    private void cmb_description4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_description4MouseClicked
        cmb_description4.removeAllItems();
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select m_desc  from pfmo.material"
            + " where m_type = '"+cmb_type4.getSelectedItem()+"'; ";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_description4.addItem(rs.getString("m_desc"));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cmb_description4MouseClicked

    private void cmb_description3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_description3MouseClicked
        cmb_description3.removeAllItems();
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select m_desc  from pfmo.material"
            + " where m_type = '"+cmb_type3.getSelectedItem()+"'; ";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_description3.addItem(rs.getString("m_desc"));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cmb_description3MouseClicked

    private void cmb_description2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_description2MouseClicked
        cmb_description2.removeAllItems();
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select m_desc  from pfmo.material"
            + " where m_type = '"+cmb_type2.getSelectedItem()+"'; ";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_description2.addItem(rs.getString("m_desc"));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cmb_description2MouseClicked

    private void cmb_description1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_description1MouseClicked
        cmb_description1.removeAllItems();
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select m_desc  from pfmo.material"
            + " where m_type = '"+cmb_type1.getSelectedItem()+"'; ";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_description1.addItem(rs.getString("m_desc"));
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cmb_description1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try{
            conn = ConnectTESTING.Connect();
            String str3 = "select m_type  from pfmo.material group by m_type;";
            ps = conn.prepareStatement(str3);
            rs = ps.executeQuery();
            while(rs.next()){
                cmb_type1.addItem(rs.getString("m_type"));
                cmb_type2.addItem(rs.getString("m_type"));
                cmb_type3.addItem(rs.getString("m_type"));
                cmb_type4.addItem(rs.getString("m_type"));
                cmb_type5.addItem(rs.getString("m_type"));
            } 
        } catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_formWindowActivated

    private void btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_submitMouseClicked
       String type="",count="";
        int cnt;
        conn = ConnectTESTING.Connect();
        int response = JOptionPane.showConfirmDialog(this,"Do you want to send this request?",
                  "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (response == JOptionPane.YES_OPTION){
            try{
                    String b = getDateTime();
                    String c = null;
                    String d = null;
                     String str5 = "select emp_no from pfmo.employee "
                            + "where username = '"+username+"' ";
                    ps = conn.prepareStatement(str5);
                    rs = ps.executeQuery();
                    if(rs.next()) d = rs.getString("emp_no");
                    String str3 = "insert into pfmo.aslip "
                            + "(aslip_date, emp_no) values "
                            + "('"+b+"', "
                            + "'"+d+"');";
                    ps = conn.prepareStatement(str3);
                    ps.execute();
                    String str4 = "select aslip_no from pfmo.aslip "
                            + "where aslip_date = '"+b+"' ";
                    ps = conn.prepareStatement(str4);
                    rs = ps.executeQuery();
                    if(rs.next()) c = rs.getString("aslip_no");
            for(int i = 0; i<Integer.parseInt(txt_numTools.getText()); i++){
            if(i == 0){
                    String str2 = "select m_code from pfmo.material"
                        + " where m_desc = '"+cmb_description1.getSelectedItem().toString()+"'"
                        + " and m_type = '"+cmb_type1.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(str2);
                    rs = ps.executeQuery();
                    if(rs.next()) type = rs.getString("m_code");
                    String st3 = "select Quantity from pfmo.material_inventory "
                            + "where Type = '"+cmb_type1.getSelectedItem().toString()+"' "
                            + "and Description = '"+cmb_description1.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(st3);
                    rs = ps.executeQuery();
                    if(rs.next()) count = rs.getString("Quantity");
                    JOptionPane.showMessageDialog(null, count);
                    if((Integer.parseInt(count))<(Integer.parseInt(txt_quantity1.getText()))) break;
                    else{
                    String str1 = "insert into pfmo.aslip_details "
                            + "(aslip_no,m_code,quantity) "
                            + "values ("
                            + " '"+c+"','"+type+"','"+txt_quantity1.getText()+"');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();}
                } if(i == 1){
                     String str2 = "select m_code from pfmo.material"
                        + " where m_desc = '"+cmb_description2.getSelectedItem().toString()+"'"
                        + " and m_type = '"+cmb_type2.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(str2);
                    rs = ps.executeQuery();
                    if(rs.next()) type = rs.getString("m_code");
                    String st3 = "select Quantity from pfmo.material_inventory "
                            + "where Type = '"+cmb_type2.getSelectedItem().toString()+"' "
                            + "and Description = '"+cmb_description2.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(st3);
                    rs = ps.executeQuery();
                    if(rs.next()) count = rs.getString("Quantity");
                    if(Integer.parseInt(count)<Integer.parseInt(txt_quantity2.getText())) break;
                    else{
                    String str1 = "insert into pfmo.aslip_details "
                            + "(aslip_no,m_code,quantity) "
                            + "values ("
                            + " '"+c+"','"+type+"','"+txt_quantity2.getText()+"');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();}
            }  if(i == 2){
                 String str2 = "select m_code from pfmo.material"
                        + " where m_desc = '"+cmb_description3.getSelectedItem().toString()+"'"
                        + " and m_type = '"+cmb_type3.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(str2);
                    rs = ps.executeQuery();
                    if(rs.next()) type = rs.getString("m_code");
                    String st3 = "select Quantity from pfmo.material_inventory "
                            + "where Type = '"+cmb_type3.getSelectedItem().toString()+"' "
                            + "and Description = '"+cmb_description3.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(st3);
                    rs = ps.executeQuery();
                    if(rs.next()) count = rs.getString("Quantity");
                    if(Integer.parseInt(count)<Integer.parseInt(txt_quantity3.getText())) break;
                    else{
                    String str1 = "insert into pfmo.aslip_details "
                            + "(aslip_no,m_code,quantity) "
                            + "values ("
                            + " '"+c+"','"+type+"','"+txt_quantity3.getText()+"');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();}
            } if(i == 3){
                 String str2 = "select m_code from pfmo.material"
                        + " where m_desc = '"+cmb_description4.getSelectedItem().toString()+"'"
                        + " and m_type = '"+cmb_type4.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(str2);
                    rs = ps.executeQuery();
                    if(rs.next()) type = rs.getString("m_code");
                    String st3 = "select Quantity from pfmo.material_inventory "
                            + "where Type = '"+cmb_type4.getSelectedItem().toString()+"' "
                            + "and Description = '"+cmb_description4.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(st3);
                    rs = ps.executeQuery();
                    if(rs.next()) count = rs.getString("Quantity");
                    if(Integer.parseInt(count)<Integer.parseInt(txt_quantity4.getText())) break;
                    else{
                    String str1 = "insert into pfmo.aslip_details "
                            + "(aslip_no,m_code,quantity) "
                            + "values ("
                            + " '"+c+"','"+type+"','"+txt_quantity4.getText()+"');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();}
            } if(i == 4){
                 String str2 = "select m_code from pfmo.material"
                        + " where m_desc = '"+cmb_description5.getSelectedItem().toString()+"'"
                        + " and m_type = '"+cmb_type5.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(str2);
                    rs = ps.executeQuery();
                    if(rs.next()) type = rs.getString("m_code");
                    String st3 = "select Quantity from pfmo.material_inventory "
                            + "where Type = '"+cmb_type5.getSelectedItem().toString()+"' "
                            + "and Description = '"+cmb_description5.getSelectedItem().toString()+"'; ";
                    ps = conn.prepareStatement(st3);
                    rs = ps.executeQuery();
                    if(rs.next()) count = rs.getString("Quantity");
                    if(Integer.parseInt(count)<Integer.parseInt(txt_quantity5.getText())) break;
                    else{
                    String str1 = "insert into pfmo.aslip_details "
                            + "(aslip_no,m_code,quantity) "
                            + "values ("
                            + " '"+c+"','"+type+"','"+txt_quantity5.getText()+"');";
                    ps = conn.prepareStatement(str1);
                    ps.execute();}
            }
            JOptionPane.showMessageDialog(null, "Successful");
        }
            } catch (Exception e){ JOptionPane.showMessageDialog(null, e
                    + "");
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
            java.util.logging.Logger.getLogger(SH71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SH71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SH71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SH71.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SH71().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cmb_description1;
    private javax.swing.JComboBox<String> cmb_description2;
    private javax.swing.JComboBox<String> cmb_description3;
    private javax.swing.JComboBox<String> cmb_description4;
    private javax.swing.JComboBox<String> cmb_description5;
    private javax.swing.JComboBox<String> cmb_type1;
    private javax.swing.JComboBox<String> cmb_type2;
    private javax.swing.JComboBox<String> cmb_type3;
    private javax.swing.JComboBox<String> cmb_type4;
    private javax.swing.JComboBox<String> cmb_type5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_numTools;
    private javax.swing.JTextField txt_quantity1;
    private javax.swing.JTextField txt_quantity2;
    private javax.swing.JTextField txt_quantity3;
    private javax.swing.JTextField txt_quantity4;
    private javax.swing.JTextField txt_quantity5;
    // End of variables declaration//GEN-END:variables
}
