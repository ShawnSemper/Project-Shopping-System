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
import javax.swing.JPanel;

/**
 *
 * @author PhoenixMay
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        AccountOwner("Account Owner"),
        Customer("Customer"),
        Seller("Seller"),
        Deliveryman("Deliveryman");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            ShoppingSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
