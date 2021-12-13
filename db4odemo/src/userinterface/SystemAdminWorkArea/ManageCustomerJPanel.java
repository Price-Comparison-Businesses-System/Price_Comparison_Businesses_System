/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sakshi
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private CustomerDirectory customerDirectory;
    public ManageCustomerJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.customerDirectory = ecosystem.getCustomerdirectory();
        System.out.println("line 39");
        populateTable();
        System.out.println("line 41");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        refreshbutton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomer.setForeground(new java.awt.Color(0, 102, 204));
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Name ", "Phone Number", "Email Address", "Street Address", "Country", "City", "Zipcode", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 777, 225));

        btnModify.setBackground(new java.awt.Color(0, 102, 204));
        btnModify.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("Modify Customer");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 165, -1));

        btnCreate.setBackground(new java.awt.Color(0, 102, 204));
        btnCreate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create Customer");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 165, -1));

        deletebutton.setBackground(new java.awt.Color(0, 102, 204));
        deletebutton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        deletebutton.setForeground(new java.awt.Color(255, 255, 255));
        deletebutton.setText("Delete Customer");
        add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, -1));

        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });


        refreshbutton.setBackground(new java.awt.Color(0, 102, 204));
        refreshbutton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        refreshbutton.setForeground(new java.awt.Color(255, 255, 255));
        refreshbutton.setText("Refresh");
        refreshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbuttonActionPerformed(evt);
            }
        });
        add(refreshbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 102, 204));
        btnBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/icons/custdesk.jpeg"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 330, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Customer customer = (Customer)tblCustomer.getValueAt(selectedRow,0);
        ModifyCustomerJPanel modifyCustomer = new ModifyCustomerJPanel(userProcessContainer, ecosystem, customerDirectory, customer);
        userProcessContainer.add("ModifyCustomersJPanel",modifyCustomer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateCustomerJPanel createCustomer = new CreateCustomerJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("CreateCustomersJPanel",createCustomer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbuttonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshbuttonActionPerformed

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

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Customer customer = (Customer) tblCustomer.getValueAt(selectedRow, 0);
        customerDirectory.deleteCustomer(customer);
	JOptionPane.showMessageDialog(btnCreate, "Customer deleted from the database");
        populateTable();
    }//GEN-LAST:event_deletebuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshbutton;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
    System.out.println("line 156");
        DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();
        dtm.setRowCount(0);
        System.out.println("line 159 --- ManageCustomerJPanel");
        for(Customer customer : ecosystem.getCustomerdirectory().getCustomerDir()){
            System.out.println("line 160");
            Object [] row = new Object[9];
            System.out.println("line 158"+customer.getcustomerName());
            row[0] = customer;
            row[1] = customer.getcustomerName();
            row[2] = customer.getcustomerPhone();
            row[3] = customer.getcustomerEmail();
            row[4] = customer.getcustomerStreetAddress();
            row[5] = customer.getcustomerCountry();
            row[6] = customer.getcustomerCity();
            row[7] = customer.getcustomerZipcode();
            row[8] = customer.getcustomerAge();
            dtm.addRow(row);
        }
    }
}
