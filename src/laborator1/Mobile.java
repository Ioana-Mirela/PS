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
public class Mobile extends Product {
    private String memory;
    private String os;
    
    public Mobile(String name, double price, String memory, String os){
        super(name,price);
        this.memory=memory;
        this.os=os;
    }
    
    @Override
    public double getPrice(int quantity) {
        double p,d;
        d=this.getPrice()*0.3;
        p=this.getPrice()*quantity- d*quantity;
        return p;
    }
    
    public String toString(){
        return "Mobil-ul "+ super.toString()+ " are memoria: "+ memory + "si so: "+ os;
    }
}
