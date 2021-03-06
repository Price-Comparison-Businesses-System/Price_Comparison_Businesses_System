/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sakshi
 */
public class ModifyCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ModifyCustomerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private Customer customer;
    private CustomerDirectory customerdirectory;
    /**
     * Creates new form ModifyCustomerJPanel
     */
    public ModifyCustomerJPanel(JPanel userProcessContainer, EcoSystem ecosystem, CustomerDirectory customerdirectory, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customerdirectory = customerdirectory;
        this.customer = customer;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfFullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfPhoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfStreetAddress = new javax.swing.JTextField();
        tfCountry = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        tfZipcode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Full Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 77, 27));

        tfFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFullNameActionPerformed(evt);
            }
        });
        jPanel1.add(tfFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 131, 27));

        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Age :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 77, 27));

        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });
        jPanel1.add(tfAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 131, 27));

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Email Address :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 91, 27));

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 131, 27));

        tfPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneNumberActionPerformed(evt);
            }
        });
        jPanel1.add(tfPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 131, 27));

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Phone Number :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 91, 27));

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Modify Customer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        btnCreate.setBackground(new java.awt.Color(0, 102, 204));
        btnCreate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreate.setText("Modify");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 131, -1));

        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Street Address:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 91, 27));

        tfStreetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStreetAddressActionPerformed(evt);
            }
        });
        jPanel1.add(tfStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 131, 27));

        tfCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCountryActionPerformed(evt);
            }
        });
        jPanel1.add(tfCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 131, 27));

        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Country:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 91, 27));

        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("City:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 91, 27));

        tfCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCityActionPerformed(evt);
            }
        });
        jPanel1.add(tfCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 131, 27));

        tfZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfZipcodeActionPerformed(evt);
            }
        });
        jPanel1.add(tfZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 131, 27));

        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setText("Zipcode:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 91, 27));

        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 10, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/icons/custdesk.jpeg"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 330, 490));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/icons/93634-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
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

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String name;
        int age=0;
         String emailaddress;
          String phone;
          String streetaddress;
        String country ;
        String city ;
        int zipcode;
        if(!tfFullName.getText().isEmpty()){
               name = tfFullName.getText();
          }
          else{
               JOptionPane.showMessageDialog(this, "Customer name is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
        boolean flag1;
        flag1 = name.matches("(?i)(^[a-z])((?![ .,'-]$)[a-z .,'-]){0,24}$");

        if(!flag1) {
            JOptionPane.showMessageDialog(this, "Enter valid Customer name");
            return;
        }
//        if(!tfAge.getText().isEmpty()){
//               age = parseInt(tfAge.getText());
//          }
//          else{
//               JOptionPane.showMessageDialog(this, "Customer age is empty","ERROR",JOptionPane.ERROR_MESSAGE);
//               return;
//        }
//        if(parseInt(tfAge.getText())<0){
//           JOptionPane.showMessageDialog(this, "customer age cannot be less than 0");
//            return;
//          } 
     /**
     * validation for customer age
     */
        try{
        if(!tfAge.getText().isEmpty()){
               age = parseInt(tfAge.getText());
          }
          else{
               JOptionPane.showMessageDialog(this, "Customer age is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
         if(parseInt(tfAge.getText())<0){
           JOptionPane.showMessageDialog(this, "customer age cannot be less than 0");
            return;
          }
       } catch(NumberFormatException ex){ 
            System.out.println(ex);
          JOptionPane.showMessageDialog(this, "Customer age must be a number","ERROR",JOptionPane.ERROR_MESSAGE);

         }
        if(!tfEmail.getText().isEmpty()){
               emailaddress = tfEmail.getText();
          }
          else{
               JOptionPane.showMessageDialog(this, "Customer email address is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
        String email = tfEmail.getText();
        boolean flagemail;
        flagemail = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flagemail) {
            JOptionPane.showMessageDialog(this, "Email Address must be in format of username@email.com");
            return;
        }
//        if(!tfPhoneNumber.getText().isEmpty()){
//               phone = tfPhoneNumber.getText();
//          }
//          else{
//               JOptionPane.showMessageDialog(this, "Customer phone number is empty","ERROR",JOptionPane.ERROR_MESSAGE);
//               return;
//        }
//        
//        if(tfPhoneNumber.getText().length() != 10){
//            JOptionPane.showMessageDialog(this, "Phone Number must be 10 digits", "Warining", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
 /**
     * validation for customer phone number
     */
        if(!tfPhoneNumber.getText().isEmpty()){
               phone = tfPhoneNumber.getText();
          }
          else{
               JOptionPane.showMessageDialog(this, "Customer phone number is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
        boolean flagphone;
        flagphone = phone.matches("^[0-9]{10}$");

        if(!flagphone) {
            JOptionPane.showMessageDialog(this, "Phone Number must be 10 digits", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!tfStreetAddress.getText().isEmpty()){
               streetaddress = tfStreetAddress.getText();
          }
          else{
               JOptionPane.showMessageDialog(this, "Customer street address is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
        boolean flagaddress;
        flagaddress = streetaddress.matches("^[a-zA-Z0-9-/, .]{1,80}$");

        if(!flagaddress) {
            JOptionPane.showMessageDialog(this, "Enter valid street address name");
            return;
        }
        if(!tfCountry.getText().isEmpty()){
               country = tfCountry.getText();
          }
          else{
               JOptionPane.showMessageDialog(this, "Customer country is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
                 boolean flagcountry;
        flagcountry = country.matches("^[a-zA-Z]+(?:(?:\\s+|-)[a-zA-Z]+)*$");

        if(!flagcountry) {
            JOptionPane.showMessageDialog(this, "Enter valid country name");
            return;
        }
        if(!tfCity.getText().isEmpty()){
               city = tfCity.getText();
          }
          else{
               JOptionPane.showMessageDialog(this, "Customer city is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
        boolean flagcity;
        flagcity = city.matches("^[a-zA-Z]+(?:(?:\\s+|-)[a-zA-Z]+)*$");

        if(!flagcity) {
            JOptionPane.showMessageDialog(this, "Enter valid city name");
            return;
        }
        if(!tfZipcode.getText().isEmpty()){
               zipcode = parseInt(tfZipcode.getText());
          }
          else{
               JOptionPane.showMessageDialog(this, "Customer zipcode is empty","ERROR",JOptionPane.ERROR_MESSAGE);
               return;
        }
        
        if(tfZipcode.getText().length() < 5 || tfZipcode.getText().length() > 6){
            JOptionPane.showMessageDialog(this, "Zip code must be 5 or 6 digits", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        customer.setcustomerAge(age);
        customer.setcustomerName(name);
        customer.setcustomerEmail(emailaddress);
        customer.setcustomerStreetAddress(streetaddress);
        customer.setcustomerCity(city);
        customer.setcustomerCountry(country);
        customer.setcustomerZipcode(zipcode);
        customer.setcustomerPhone(phone);

        JOptionPane.showMessageDialog(this, "Customer Profile Updated");
        tfFullName.setText("");
        tfPhoneNumber.setText("");
        tfAge.setText("");
        tfStreetAddress.setText("");
        tfEmail.setText("");
        tfCountry.setText("");
        tfCity.setText("");
        tfZipcode.setText("");

    }//GEN-LAST:event_btnCreateActionPerformed

    private void tfStreetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStreetAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStreetAddressActionPerformed

    private void tfCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCountryActionPerformed

    private void tfCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCityActionPerformed

    private void tfZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfZipcodeActionPerformed

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfCountry;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfStreetAddress;
    private javax.swing.JTextField tfZipcode;
    // End of variables declaration//GEN-END:variables
}
