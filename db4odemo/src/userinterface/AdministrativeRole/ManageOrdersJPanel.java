/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Enterprise.Enterprise;
import Business.Orders.Orders;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author netra
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

	/**
	 * Creates new form ManageOrdersJPanel
	 */
	private Enterprise enterprise;;
        private JPanel userProcessContainer;
        private CustomerDirectory customerdir;
        private OrganizationDirectory orgdir;
	public ManageOrdersJPanel(JPanel userProcessContainer, Enterprise enterprise) {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.enterprise = enterprise;
            this.customerdir = enterprise.getCustomerdirectory();
            this.orgdir = enterprise.getOrganizationDirectory();
            populateOrderTable();
            populateDeliveryMenTable();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Customer", "Store/ seller Name", "Delivery Location", "Total Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 730, 165));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/93634-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 56, 52));

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Orders for your Enterprise");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 20, 240, 32));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/icons/order1.jpeg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 740, 490));
    }// </editor-fold>//GEN-END:initComponents

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);                // TODO add your handling code here:userProcessContainer.remove(this);
                
        }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderJTable;
    // End of variables declaration//GEN-END:variables

    private void populateOrderTable() {
        DefaultTableModel model = (DefaultTableModel) orderJTable.getModel();
        model.setRowCount(0);
        for(Orders o : enterprise.getOrders()){
            Object[] row = new Object[6]; 
            row[0] = o.getOrderID();
            row[1] = o.getCustomerName();
            row[2] = o.getEnterpriseName();
            row[3] = o.getCustomerAddress();
            row[4] = o.getTotalprice();
            row[5] = o.getStatus();
            model.addRow(row);
        }
    }

    private void populateDeliveryMenTable() {
//        DefaultTableModel model = (DefaultTableModel) deliveryJTable.getModel();
//        model.setRowCount(0);
//        for(Organization o : orgdir.getOrganizationList()){
//            if(o.getType().equals("Delivery")){
//                for(UserAccount ua : o.getUserAccountDirectory().getUserAccountList()){
//                    Object[] row = new Object[4]; 
//                    row[0] = o.getOrgName();
//                    row[1] = o.getOrgEmail();
//                    row[2] = o.getOrgPhone();
//                    row[3] = ua.getUsername();
//                    model.addRow(row);   
//                }
//            }
//
//        }
    }
}
