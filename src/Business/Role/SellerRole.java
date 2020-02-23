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
import UserInterface.SellerRole.SellerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author PhoenixMay
 */
public class SellerRole extends Role{
      
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, ShoppingSystem business) {
        return new SellerWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    @Override
    public String toString() {
        return "SellerRole";
    }
}
