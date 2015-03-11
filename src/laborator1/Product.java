/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator1;

/**
 *
 * @author Student
 */
public abstract class Product {
    private double price;
    private String name;
    
    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public abstract double getPrice(int quantity);
    
    public String toString(){
        return "numele: "+ name + "cu pretul: "+price;
    }
    
}
