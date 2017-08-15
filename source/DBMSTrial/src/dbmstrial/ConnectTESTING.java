/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmstrial;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class ConnectTESTING {
     public static Connection Connect() {
        try {
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/pfmo","root","admin");
            return conn;
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
