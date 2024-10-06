/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bao_hanh_san_pham;

/**
 *
 * @author P51
 */
public class Product {
    private String productId, productName;
    private int price, warrantyTime;

    public Product(String productId, String productName, int price, int warrantyTime) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.warrantyTime = warrantyTime;
    }

    public String getProductId() {
        return productId;
    }

    public int getWarrantyTime() {
        return warrantyTime;
    }

    public int getPrice() {
        return price;
    }

//    @Override
//    public String toString() {
//        return "Product{" + "productId=" + productId + ", productName=" + productName + ", price=" + price + ", warrantyTime=" + warrantyTime + '}';
//    }
    
    
    
}
