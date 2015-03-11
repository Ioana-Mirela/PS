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
public class Laptop extends Product{
    private String processor;
    private String screenSize;
    
    public Laptop(String name, double price, String processor, String screenSize){
        super(name,price);
        this.processor=processor;
        this.screenSize=screenSize;
    }
    
    @Override
    public double getPrice(int quantity) {
        double p,d;
        d=this.getPrice()*0.1;
        p=this.getPrice()*quantity- d*quantity;
        return p;
    }
    
    public String toString(){
        return "Laptop-ul "+ super.toString()+ " are procesorul: "+ processor + "si dimensiunea excranului: "+ screenSize;
    }
    
}
