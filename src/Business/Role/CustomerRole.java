/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.ShoppingSystem;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerRole.CustomerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author PhoenixMay
 */
public class CustomerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, ShoppingSystem business) {
        return new CustomerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    @Override
    public String toString() {
        return "CustomerRole";
    }
}
