package view;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import model.*;
import controller.*;
import java.awt.event.ActionListener;

public class PmsRegistrationView extends javax.swing.JFrame {
RegisterModel model;

    public PmsRegistrationView() {
        initComponents();
        addPlaceholderStyle(txtFname);
        addPlaceholderStyle(txtLname);
        addPlaceholderStyle(txtEmail);
        addPlaceholderStyle(txtPhone);
        addPlaceholderStyle(txtPassword);
        addPlaceholderStyle(txtConfirm);
        addPlaceholderStyle(txtSquestion);
        
    }
  public RegisterModel getUser()
{
    model=new RegisterModel(txtFname.getText(),txtLname.getText(),txtEmail.getText(),txtPhone.getText(),txtPassword.getText(),txtConfirm.getText(),txtSquestion.getText());
    return model;
}

public void setMessage(String msg)
{
    JOptionPane.showMessageDialog(this, msg);
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

        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtConfirm = new javax.swing.JTextField();
        txtSquestion = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up Page");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel1.setText("Security Question :");

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPassword.setText("Password");
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

        txtPhone.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtPhone.setText("Phone Number");
        txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneFocusLost(evt);
            }
        });
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtLname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtLname.setText("Last Name");
        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLnameFocusLost(evt);
            }
        });
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEmail.setText("E-Mail");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtFname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFname.setText("First Name");
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFnameFocusLost(evt);
            }
        });
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        txtConfirm.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtConfirm.setText("Confirm");
        txtConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmFocusLost(evt);
            }
        });
        txtConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmActionPerformed(evt);
            }
        });

        txtSquestion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtSquestion.setText("What is your childhood school name?");
        txtSquestion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSquestionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSquestionFocusLost(evt);
            }
        });
        txtSquestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSquestionActionPerformed(evt);
            }
        });

        btnSignup.setBackground(new java.awt.Color(0, 0, 102));
        btnSignup.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign Up");
        btnSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create your Account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSquestion, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSquestion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmActionPerformed

    private void txtSquestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSquestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSquestionActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        RegisterController r=new RegisterController(this);
    }//GEN-LAST:event_btnSignupActionPerformed
    public void addLoginListner(ActionListener log)
{
    btnSignup.addActionListener(log);
}
    private void txtFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusGained
    if(txtFname.getText().equals("First Name")){
            txtFname.setText(null);
            txtFname.requestFocus();
            
            removePlaceholderStyle(txtFname);
        }        
    }//GEN-LAST:event_txtFnameFocusGained

    private void txtFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusLost
        if(txtFname.getText().length()==0){
           addPlaceholderStyle(txtFname);
           txtFname.setText("First Name");
        }
    }//GEN-LAST:event_txtFnameFocusLost

    private void txtLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusGained
        if(txtLname.getText().equals("Last Name")){
                txtLname.setText(null);
                txtLname.requestFocus();
                removePlaceholderStyle(txtLname);
            }
    }//GEN-LAST:event_txtLnameFocusGained

    private void txtLnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusLost
        if(txtLname.getText().length()==0){
            addPlaceholderStyle(txtLname);
                txtLname.setText("Last Name");
                
            }
    }//GEN-LAST:event_txtLnameFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if(txtPassword.getText().equals("Password")){
            txtPassword.setText(null);
            txtPassword.requestFocus();
            
            removePlaceholderStyle(txtPassword);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if(txtPassword.getText().length()==0){
           addPlaceholderStyle(txtPassword);
           txtPassword.setText("Password");
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getText().equals("E-Mail")) {
    txtEmail.setText(null);
    txtEmail.requestFocus();
    
    removePlaceholderStyle(txtEmail);
}

    }//GEN-LAST:event_txtEmailFocusGained

    private void txtPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusGained
        if (txtPhone.getText().equals("Phone Number")) {
    txtPhone.setText(null);
    txtPhone.requestFocus();
    
    removePlaceholderStyle(txtPhone);
}

    }//GEN-LAST:event_txtPhoneFocusGained

    private void txtConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusGained
        if (txtConfirm.getText().equals("Confirm")) {
    txtConfirm.setText(null);
    txtConfirm.requestFocus();
    removePlaceholderStyle(txtConfirm);
        }
    }//GEN-LAST:event_txtConfirmFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().length() == 0) {
    addPlaceholderStyle(txtEmail);
    txtEmail.setText("E-Mail");
    }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusLost
        if (txtPhone.getText().length() == 0) {
    addPlaceholderStyle(txtPhone);
    txtPhone.setText("Phone Number");
}

    }//GEN-LAST:event_txtPhoneFocusLost

    private void txtConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmFocusLost
        if (txtConfirm.getText().length() == 0) {
        addPlaceholderStyle(txtConfirm);
        txtConfirm.setText("Confirm");
}

    }//GEN-LAST:event_txtConfirmFocusLost

    private void txtSquestionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSquestionFocusLost
        if (txtSquestion.getText().length() == 0) {
        addPlaceholderStyle(txtSquestion);
        txtSquestion.setText("What is your childhood school name?");
}

    }//GEN-LAST:event_txtSquestionFocusLost

    private void txtSquestionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSquestionFocusGained
        if (txtSquestion.getText().equals("What is your childhood school name?")) {
        txtSquestion.setText(null);
        txtSquestion.requestFocus();
    
    removePlaceholderStyle(txtSquestion);
}
    }//GEN-LAST:event_txtSquestionFocusGained

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
            java.util.logging.Logger.getLogger(PmsRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PmsRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PmsRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PmsRegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PmsRegistrationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtConfirm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSquestion;
    // End of variables declaration//GEN-END:variables
}
