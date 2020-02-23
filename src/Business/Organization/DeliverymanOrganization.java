/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliverymanRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PhoenixMay
 */
public class DeliverymanOrganization extends Organization {
    
    public DeliverymanOrganization() {
        super(Organization.Type.Deliveryman.getValue());
        super.setOrganizationType(Type.Deliveryman);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliverymanRole());
        return roles;
    }
}
