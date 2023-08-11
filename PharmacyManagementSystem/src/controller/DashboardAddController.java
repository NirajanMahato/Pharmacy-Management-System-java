package controller;

import view.DashboardView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import model.*;

public class DashboardAddController {
    DashboardAddModel model1;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst=null;
        public DashboardAddController(DashboardView view)
        {
            this.view=view;
            
             view.addLoginListner1(new RegisetrListener());
        }
        
        
    class RegisetrListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                model1=view.getUser2();
                if(bookUser(model1))
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
       
        public boolean bookUser(DashboardAddModel user) throws Exception
        {
           
try
          {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb2","root","password");
String sql="insert into medicine(medicineName,rate,quantity,total) values(?,?,?,?)";
pst = conn.prepareStatement(sql);

pst.setString(1,user.getMedicinename());
pst.setInt(2,user.getRate());
pst.setInt(3,user.getQuantity());
pst.setInt(4,user.getTotal());


pst.executeUpdate();
JOptionPane.showMessageDialog(null,"Medicine insertered Successfully");
          
          }
          catch(Exception e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }
    
}
    
}
