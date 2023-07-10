/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import model.*;
import view.*;
import java.sql.*;
public class ForgetPasswordController {
    ForgetPasswordModel model;
    ForgetPasswordView view;
    ResultSet rs;
    Statement stmt;
    public ForgetPasswordController(ForgetPasswordView view)
    {
     this.view = view;
    new LoginListener().actionPerformed();
        
    }
    class LoginListener
    {
        public void actionPerformed() {
            try
            {
                model=view.getUser();
                String newPassword = model.getPassword();
                if(resetPassword(model,newPassword))
                {
                    view.setMessage("Changed Successfully!!");
                    view.dispose();
                }
                else
                {
                    view.setMessage("Invalid username");
                    
                }
            }
            catch(Exception e1)
            {
                System.out.println(e1.getMessage());
            }

        }
public boolean resetPassword(ForgetPasswordModel user, String newPassword) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root","password");

    String sql = "SELECT * FROM login WHERE email='" + user.getUsername() +  "' AND school_name='" + user.getSchoolname() + "'";

    try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);

        if (rs.next()) {
            // User exists with the provided email, password, and food combination
            String updateSql = "UPDATE login SET passw = ? WHERE email=?";
            PreparedStatement pstmt = conn.prepareStatement(updateSql);
            pstmt.setString(1, newPassword);
            pstmt.setString(2, user.getUsername());
            pstmt.executeUpdate();
            conn.close();
            return true;
        }

        conn.close();
    } catch (Exception e2) {
        System.out.println(e2.getMessage());
    }

    return false;
}

    }  
}

