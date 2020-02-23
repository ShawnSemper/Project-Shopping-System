/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Common.Product;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PhoenixMay
 */
public class ShoppingPlatformEnterprise extends Enterprise {
    
    private ArrayList<Product> products;
    
    public ShoppingPlatformEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.ShoppingPlatform);
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
