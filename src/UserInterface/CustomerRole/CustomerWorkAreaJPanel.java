/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Enterprise.Enterprise;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.ShoppingSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.security.auth.login.AccountException;
import javax.swing.JPanel;

/**
 *
 * @author PhoenixMay
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private CustomerOrganization customerOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ShoppingSystem business;
    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, ShoppingSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.customerOrganization = (CustomerOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        
        lblCo.setText(enterprise.toString() + " - " + organization.toString());
        lblUser.setText("Welcome: " + account.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnShopping = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        lblCo = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnShopping.setBackground(new java.awt.Color(255, 255, 243));
        btnShopping.setText("Shopping");
        btnShopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShoppingActionPerformed(evt);
            }
        });

        btnOrders.setBackground(new java.awt.Color(255, 255, 243));
        btnOrders.setText("Orders");
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });

        lblCo.setFont(new java.awt.Font("Bangla MN", 0, 20)); // NOI18N
        lblCo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCo.setText("Enterprise-Organization");

        lblUser.setFont(new java.awt.Font("Bangla MN", 0, 20)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Welcome, XXXXXX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShopping, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblCo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUser)
                .addGap(55, 55, 55)
                .addComponent(btnShopping, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShoppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoppingActionPerformed
        ShoppingJPanel shoppingJPanel =new ShoppingJPanel(userProcessContainer, userAccount, customerOrganization, enterprise, business);
        userProcessContainer.add("ShoppingJPanel", shoppingJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnShoppingActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        OrdersJPanel ordersJPanel = new OrdersJPanel(userProcessContainer, userAccount, customerOrganization, enterprise, business);
        userProcessContainer.add("ordersJPanel", ordersJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnShopping;
    private javax.swing.JLabel lblCo;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
