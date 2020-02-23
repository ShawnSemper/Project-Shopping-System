/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Common;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author PhoenixMay
 */
public class Order {
    private int id;
    private static int count = 1;
    
    private UserAccount customer;
    private UserAccount seller;
    private String product;
    private int price;
    private int quantity;
    private int totalPrice;
    private UserAccount deliveryman;
    private String contactInfo;
    private String shippingFrom;
    private String shippingTo;
    private Date createDate;
    private PaymentStatus paymentStatus;
    private SellerStatus sellerStatus;
    private DeliveryStatus deliveryStatus;
    private Status status;
    
    public Order(){
        this.createDate = new Date();
        this.id = count;
        count++;
    }
    
    
    public enum PaymentStatus{
        Pending("Pending"), Fail("Fail"), Success("Success");
        
        private String value;
        
        private PaymentStatus(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
        }
    }
    
    public enum SellerStatus{
        Pending("Pending"), Fail("Fail"), Success("Success");
        
        private String value;
        
        private SellerStatus(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
        }
    }
    
    public enum DeliveryStatus{
        Pending("Pending"), Finished("Finished");
        
        private String value;
        
        private DeliveryStatus(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
        }
    }
    
    public enum Status{
        Pending("Pending"), Fail("Fail"), Success("Success");
        
        private String value;
        
        private Status(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
        }
    }

    public int getId() {
        return id;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public UserAccount getSeller() {
        return seller;
    }

    public void setSeller(UserAccount seller) {
        this.seller = seller;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public UserAccount getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(UserAccount deliveryman) {
        this.deliveryman = deliveryman;
    }

    public String getShippingFrom() {
        return shippingFrom;
    }

    public void setShippingFrom(String shippingFrom) {
        this.shippingFrom = shippingFrom;
    }

    public String getShippingTo() {
        return shippingTo;
    }

    public void setShippingTo(String shippingTo) {
        this.shippingTo = shippingTo;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public SellerStatus getSellerStatus() {
        return sellerStatus;
    }

    public void setSellerStatus(SellerStatus sellerStatus) {
        this.sellerStatus = sellerStatus;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }
    
    
    
    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
