/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AccountOwnerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PhoenixMay
 */
public class AccountOwnerOrganization extends Organization{
    
    public AccountOwnerOrganization() {
        super(Organization.Type.AccountOwner.getValue());
        super.setOrganizationType(Type.AccountOwner);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccountOwnerRole());
        return roles;
    }
}
