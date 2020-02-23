/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Common.Order;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author PhoenixMay
 */
public class DeliveryCoEnterprise extends Enterprise {
    
    private ArrayList<Order> deliveryOrderList;

    public ArrayList<Order> getDeliveryOrderList() {
        return deliveryOrderList;
    }

    public void setDeliveryOrderList(ArrayList<Order> deliveryOrderList) {
        this.deliveryOrderList = deliveryOrderList;
    }
    
    public DeliveryCoEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.DeliveryCo);
        this.deliveryOrderList = new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
