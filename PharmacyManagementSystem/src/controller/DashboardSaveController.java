package controller;

import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import model.*;

public class DashboardSaveController {
    DashboardSaveModel model;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst=null;
        public DashboardSaveController(DashboardView view)
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
                model=view.getUser1();
                if(bookUser(model))
                {
                    view.setMessage("Registered Successfully");
                }
                else
                {
//                    view.setMessage("Invalid username or password");
                    
                }
            }
            catch(Exception e1)
            {
                
            }

        }
       
        public boolean bookUser(DashboardSaveModel user) throws Exception
        {
           
try
          {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root","password");
String sql="insert into details(pname,address,pid) values(?,?,?)";
pst = conn.prepareStatement(sql);

pst.setString(1,user.getName());
pst.setString(2,user.getAddress());
pst.setInt(3,user.getUserid());

pst.executeUpdate();
JOptionPane.showMessageDialog(null,"user Registered Successfully");
          
          }
          catch(Exception e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }
    
}
    
}
