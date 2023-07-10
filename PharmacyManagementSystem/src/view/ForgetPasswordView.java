package view;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import model.RegisterModel;
import controller.*;
import model.*;

public class ForgetPasswordView extends javax.swing.JFrame {
ForgetPasswordModel model;
    public ForgetPasswordView() {
        initComponents();
        addPlaceholderStyle(txtEmail);
        addPlaceholderStyle(txtPassword);
        addPlaceholderStyle(txtSname);
    }
    public void addPlaceholderStyle(JTextField textField){
    Font font = textField.getFont();
    font = font.deriveFont(Font.ITALIC);
    textField.setFont(font);
    textField.setForeground(Color.gray);
    }
    public void removePlaceholderStyle(JTextField textField){
    Font font = textField.getFont();
    font = font.deriveFont(Font.PLAIN);
    textField.setFont(font);
    textField.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtSname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forget Password");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reset Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPassword.setText("Enter new Password");
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtSname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtSname.setText("What is your childhood school name?");
        txtSname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSnameFocusLost(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEmail.setText("Enter your E-mail Address");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(0, 0, 102));
        btnChange.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setText("Change Password");
        btnChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail)
                    .addComponent(txtPassword)
                    .addComponent(txtSname, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(btnChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtSname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  public ForgetPasswordModel getUser()
{
    model=new ForgetPasswordModel(txtEmail.getText(),txtPassword.getText(),txtSname.getText());
    return model ;
}

public void setMessage(String msg)
{
    JOptionPane.showMessageDialog(this, msg);
}
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if(txtPassword.getText().equals("Enter new Password")){
            txtPassword.setText(null);
            txtPassword.requestFocus();
            
            removePlaceholderStyle(txtPassword);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if(txtPassword.getText().length()==0){
           addPlaceholderStyle(txtPassword);
           txtPassword.setText("Enter new Password");
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if(txtEmail.getText().length()==0){
           addPlaceholderStyle(txtEmail);
           txtEmail.setText("Enter your E-mail Address");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if(txtEmail.getText().equals("Enter your E-mail Address")){
            txtEmail.setText(null);
            txtEmail.requestFocus();
            
            removePlaceholderStyle(txtEmail);
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtSnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSnameFocusGained
        if(txtSname.getText().equals("What is your childhood school name?")){
            txtSname.setText(null);
            txtSname.requestFocus();
            
            removePlaceholderStyle(txtSname);
        }
    }//GEN-LAST:event_txtSnameFocusGained

    private void txtSnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSnameFocusLost
        if(txtSname.getText().length()==0){
           addPlaceholderStyle(txtSname);
           txtSname.setText("What is your childhood school name?");
        }
    }//GEN-LAST:event_txtSnameFocusLost

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
      ForgetPasswordController r1 = new ForgetPasswordController(this);
    }//GEN-LAST:event_btnChangeActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPasswordView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSname;
    // End of variables declaration//GEN-END:variables
}
