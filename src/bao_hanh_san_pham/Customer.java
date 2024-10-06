/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bao_hanh_san_pham;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author P51
 */
public class Customer implements  Comparable<Customer>{
    private String id, name, address, productId, buyDate;
    private int numBuy, totalCost;
    private SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

    private Date warrantyDate;
    private static int count = 0;
    public Customer(String name, String address, String productId, int numBuy, String buyDate) {
        this.name = name;
        this.address = address;
        this.buyDate = buyDate;
        this.numBuy = numBuy;
        this.productId = productId;
        this.id = String.format("KH%02d", ++count);
    }

    public String getProductId() {
        return productId;
    }
    
    
    public void calWarrantyDate(int warrantyTime) throws ParseException{
        
        String a[] = buyDate.split("/");
        int month = Integer.parseInt(a[1]);
        int predictedMonth = month + warrantyTime;
        int years = predictedMonth / 12;
        int predictedYears = Integer.parseInt(a[2]) + years;
        predictedMonth = predictedMonth % 12;
        String res = String.format("%s/%02d/%d", a[0], predictedMonth, predictedYears);
        this.warrantyDate = sd.parse(res);
    }
    
    public void calTotalCost(int price) {
        this.totalCost = price * numBuy;
    }
    
    @Override
    public int compareTo(Customer other) {
        return Long.compare(this.warrantyDate.getTime(), other.warrantyDate.getTime());
    }
    
    @Override
    public String toString(){ 
        return id + " " + name + " " + address + " " + productId + " " + totalCost + " " + sd.format(warrantyDate);
//        return id + " " + name + " " + address + " " + productId + " " + buyDate;
    }
    
    
    
}
