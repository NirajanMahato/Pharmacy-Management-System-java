package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import model.*;
import view.*;

public class RegisterController {
    RegisterModel model;
    PmsRegistrationView view;
    ResultSet rs;
    PreparedStatement pst=null;
        public RegisterController(PmsRegistrationView view)
        {
            this.view=view;
            
             view.addLoginListner(new RegisetrListener());
        }
        
        
    class RegisetrListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                model=view.getUser();
                if(checkUser(model))
                {
                    view.setMessage("Registered Successfully");
                    view.dispose();
                }
                else
                {
                    view.dispose();
//                    view.setMessage("Invalid username or password");  
                }
            }
            catch(Exception e1)
            {
                
            }

        }
       
        public boolean checkUser(RegisterModel user) throws Exception
        {
           
try
          {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root","password");
String sql="insert into login(fname,lname,email,phone,passw,confirm,school_name) values(?,?,?,?,?,?,?)";
pst = conn.prepareStatement(sql);


pst.setString(1,user.getFname());
pst.setString(2,user.getLname());
pst.setString(3,user.getEmail());
pst.setString(4,user.getPhone());
pst.setString(5,user.getPassword());
pst.setString(6,user.getConfirm());
pst.setString(7,user.getSchoolname());

pst.executeUpdate();
    JOptionPane.showMessageDialog(null,"Data Registered Successfully");
          
          }
          catch(Exception e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }
    
}
    
}
