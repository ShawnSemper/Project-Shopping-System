/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DeliverymanRole;

import Business.Common.Order;
import Business.Enterprise.DeliveryCoEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliverymanOrganization;
import Business.Organization.Organization;
import Business.ShoppingSystem;
import Business.UserAccount.UserAccount;
import UserInterface.SellerRole.ProcessOrderJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PhoenixMay
 */
public class DeliverymanWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DeliverymanOrganization deliverymanOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ShoppingSystem business;
    private DeliveryCoEnterprise deliveryCo;
    /**
     * Creates new form DeliverymanWorkAreaJPanel
     */
    public DeliverymanWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, ShoppingSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.deliverymanOrganization = (DeliverymanOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.deliveryCo = (DeliveryCoEnterprise) enterprise;
        
        lblCo.setText(enterprise.toString() + " - " + organization.toString());
        lblUser.setText("Welcome: " + account.toString());
        
        populateOrders();
    }

    public void populateOrders(){
        DefaultTableModel dtm = (DefaultTableModel) tblDeliveryOrders.getModel();
        dtm.setRowCount(0);
        for(Order a : deliveryCo.getDeliveryOrderList()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a;
            row[1] = a.getShippingFrom();
            row[2] = a.getShippingTo();
            row[3] = a.getDeliveryman();
            row[4] = a.getDeliveryStatus();
            dtm.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUser = new javax.swing.JLabel();
        lblCo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveryOrders = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();

        setBackground(new java.awt.Color(239, 255, 233));

        lblUser.setBackground(new java.awt.Color(119, 170, 173));
        lblUser.setFont(new java.awt.Font("Bangla MN", 0, 20)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Welcome, XXXXXX");

        lblCo.setBackground(new java.awt.Color(119, 170, 173));
        lblCo.setFont(new java.awt.Font("Bangla MN", 0, 20)); // NOI18N
        lblCo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCo.setText("Enterprise-Organization");

        jLabel5.setFont(new java.awt.Font("Bangla MN", 0, 14)); // NOI18N
        jLabel5.setText("Delivery Orders:");

        jScrollPane1.setBackground(new java.awt.Color(110, 119, 131));

        tblDeliveryOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "From", "To", "Assignee", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryOrders.setRowHeight(24);
        jScrollPane1.setViewportView(tblDeliveryOrders);
        if (tblDeliveryOrders.getColumnModel().getColumnCount() > 0) {
            tblDeliveryOrders.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        btnProcess.setBackground(new java.awt.Color(255, 255, 243));
        btnProcess.setText("Process");
        btnProcess.setPreferredSize(new java.awt.Dimension(79, 32));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(255, 255, 243));
        btnAssign.setText("Assign to me");
        btnAssign.setPreferredSize(new java.awt.Dimension(79, 32));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148))
            .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblCo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUser)
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryOrders.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an order to process", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            Order order = (Order)tblDeliveryOrders.getValueAt(selectedRow, 0);
            if(order.getDeliveryman() == null){
                JOptionPane.showMessageDialog(null, "Please assign it to you at first", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            DeliveryJPanel panel = new DeliveryJPanel(this.userProcessContainer, order, business);
            userProcessContainer.add("ProcessOrderJPanel", panel);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveryOrders.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an order to assign", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            Order order = (Order)tblDeliveryOrders.getValueAt(selectedRow, 0);
            if(order.getDeliveryman() != null){
                JOptionPane.showMessageDialog(null, "Sorry this order has already been assigned", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
                order.setDeliveryman(userAccount);
                populateOrders();
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tblDeliveryOrders;
    // End of variables declaration//GEN-END:variables
}
