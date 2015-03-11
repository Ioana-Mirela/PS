/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Cart {
    private HashMap<Product,Integer> products ;
    
    public Cart(){
        products = new  HashMap<Product,Integer>();
    }
    
    public void addProduct(Product p, int c){
       products.put(p,c);
    }
    
    public double getTotalPrice(){
        double s=0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
           s=s+entry.getKey().getPrice(entry.getValue());
        }
        return s;
    }
    
    public String toString(){
        String s="";
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
           s=s+entry.getKey().toString();
        }
        return s;
    }
}
