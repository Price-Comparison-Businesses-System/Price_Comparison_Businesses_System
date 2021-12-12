/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

 private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private CustomerDirectory customerDirectory;
    private Customer customer;
     private Items items;
        private ItemsDirectory itemsDirectory;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization Organization, Enterprise enterprise, EcoSystem business ) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.customerDirectory = business.getCustomerdirectory();
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
    }
    
    public void populateRequestTable(){
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTransport = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnClothing = new javax.swing.JButton();
        btnHealthCare = new javax.swing.JButton();
        btnElectronics = new javax.swing.JButton();
        btnFoodProducts = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTransport.setText("Transport");
        btnTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransportActionPerformed(evt);
            }
        });
        add(btnTransport, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 134, -1));

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 28, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Welcome <value>");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 27, -1, 30));

        btnClothing.setText("Clothing");
        btnClothing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClothingActionPerformed(evt);
            }
        });
        add(btnClothing, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 141, 134, -1));

        btnHealthCare.setText("Healthcare");
        btnHealthCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealthCareActionPerformed(evt);
            }
        });
        add(btnHealthCare, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 182, 134, -1));

        btnElectronics.setText("Electronics");
        btnElectronics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectronicsActionPerformed(evt);
            }
        });
        add(btnElectronics, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 223, 134, -1));

        btnFoodProducts.setText("Food Products");
        btnFoodProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodProductsActionPerformed(evt);
            }
        });
        add(btnFoodProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 258, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportActionPerformed
   Customer c=    ecosystem.getCustomerdirectory().findCustomer(account.getUsername());
   
        TransportJPanel transportJPanel = new TransportJPanel(userProcessContainer, ecosystem, c, enterprise);
            userProcessContainer.add("transportJPanel", transportJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnTransportActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnClothingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClothingActionPerformed
        // TODO add your handling code here:
         Customer c= ecosystem.getCustomerdirectory().findCustomer(account.getUsername());
        
        ClothingJPanel clothingJPanel = new ClothingJPanel(userProcessContainer, ecosystem, c, enterprise );
            userProcessContainer.add("clothingJPanel", clothingJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnClothingActionPerformed

    private void btnHealthCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealthCareActionPerformed
        // TODO add your handling code here:
        Customer c=    ecosystem.getCustomerdirectory().findCustomer(account.getUsername());
       HealthCareJPanel healthcareJPanel = new HealthCareJPanel(userProcessContainer, ecosystem, c, enterprise);
            userProcessContainer.add("healthcareJPanel", healthcareJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHealthCareActionPerformed

    private void btnElectronicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectronicsActionPerformed
        // TODO add your handling code here:
        Customer c=    ecosystem.getCustomerdirectory().findCustomer(account.getUsername());
        ElectronicsJPanel electronicsJPanel = new ElectronicsJPanel(userProcessContainer, ecosystem, c, enterprise);
            userProcessContainer.add("electronicsJPanel", electronicsJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnElectronicsActionPerformed

    private void btnFoodProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodProductsActionPerformed
        // TODO add your handling code here:
        Customer c=    ecosystem.getCustomerdirectory().findCustomer(account.getUsername());
        FoodProductsJPanel foodproductsJPanel = new FoodProductsJPanel(userProcessContainer, ecosystem, c, enterprise);
            userProcessContainer.add("foodproductsJPanel", foodproductsJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFoodProductsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClothing;
    private javax.swing.JButton btnElectronics;
    private javax.swing.JButton btnFoodProducts;
    private javax.swing.JButton btnHealthCare;
    private javax.swing.JButton btnTransport;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton refreshTestJButton;
    // End of variables declaration//GEN-END:variables
}
