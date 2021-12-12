/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Role.CustomerRole;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.MainJFrame;

/**
 *
 * @author sakshi
 */
public class CreateCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomerJPanel
     */
   private JPanel userProcessContainer;
    private EcoSystem ecosystem; 
    private Employee employee;
    private Customer customer;
    private CustomerDirectory customerdirectory;
    
    /**
     * Creates new form CreateCustomerJPanel
     */
    public CreateCustomerJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerdirectory = ecosystem.getCustomerdirectory();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        tfFullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfStreetAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        tfZipcode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfCountry = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Full Name :");

        tfFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFullNameActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Age :");

        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Email Address :");

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Phone Number :");

        tfPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneNumberActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Street Address:");

        tfStreetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStreetAddressActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Country:");

        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("City:");

        tfCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCityActionPerformed(evt);
            }
        });

        tfZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfZipcodeActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("Zipcode:");

        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Username :");

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Password  :");

        btnCreate.setBackground(new java.awt.Color(0, 102, 204));
        btnCreate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Create Customer");

        tfCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCountryActionPerformed(evt);
            }
        });

        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(backbutton)
                .addContainerGap(761, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(323, 323, 323))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(321, 321, 321)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tfStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(tfZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreate)
                                    .addComponent(tfPassword)))))
                    .addContainerGap(321, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(backbutton)
                .addGap(35, 35, 35)
                .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(tfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnCreate)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFullNameActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneNumberActionPerformed

    private void tfStreetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStreetAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStreetAddressActionPerformed

    private void tfCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCityActionPerformed

    private void tfZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfZipcodeActionPerformed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        String name = tfFullName.getText();
        String phone = tfPhoneNumber.getText();
        int age = parseInt(tfAge.getText());
        String streetaddress = tfStreetAddress.getText();
        String emailaddress = tfEmail.getText();
        String country = tfCountry.getText();
        String city = tfCity.getText();
        int zipcode = parseInt(tfZipcode.getText());
        String username = tfUsername.getText();
        String password = tfPassword.getText();

        if(tfFullName.getText().isEmpty() || tfPhoneNumber.getText().isEmpty() || tfStreetAddress.getText().isEmpty() || tfAge.getText().isEmpty() || tfEmail.getText().isEmpty() || tfPassword.getText().isEmpty() || tfUsername.getText().isEmpty() || tfCountry.getText().isEmpty() || tfCity.getText().isEmpty() || tfZipcode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill the empty fields", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(tfPhoneNumber.getText().length() != 10){
            JOptionPane.showMessageDialog(null, "Phone Number must be 10 digits", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(tfZipcode.getText().length() < 5 || tfZipcode.getText().length() > 6){
            JOptionPane.showMessageDialog(null, "Zip code must be 5 or 6 digits", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String email = tfEmail.getText();
        boolean flag1;
        flag1 = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag1) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of username@email.com");
            return;
        }

        for(Customer customer : ecosystem.getCustomerdirectory().getCustomerDir()) {
            if(customer.getcustomerEmail().equals(emailaddress)) {
                JOptionPane.showMessageDialog(null, "Email Address already exists");
            }
        }

        boolean flag = ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(username);
        if(flag == false){
            JOptionPane.showMessageDialog(null, "User name already exists");
        }
        else{
            ecosystem.getCustomerdirectory().newCustomer(name, phone, age, streetaddress, emailaddress, username, password, country, city, zipcode);
            ecosystem.getUserAccountDirectory().createUserAccount(username, password, employee, new CustomerRole());
            JOptionPane.showMessageDialog(null,"Customer Created");
        }
        tfFullName.setText("");
        tfPhoneNumber.setText("");
        tfAge.setText("");
        tfStreetAddress.setText("");
        tfEmail.setText("");
        tfCountry.setText("");
        tfCity.setText("");
        tfZipcode.setText("");
        tfUsername.setText("");
        tfPassword.setText("");
        System.out.println("message");

    }//GEN-LAST:event_btnCreateActionPerformed

    private void tfCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCountryActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
//        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        //SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
//        //sysAdminwjp.populateTree();
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbuttonActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateCustomerJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateCustomerJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateCustomerJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateCustomerJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfCountry;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfStreetAddress;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JTextField tfZipcode;
    // End of variables declaration//GEN-END:variables
}
