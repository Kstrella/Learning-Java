/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author kevinestrella
 */
public class Car {
    
    private String make;
    private String model;
    private int year;
    
    Car(String make,String model,int year){
        
        
        //with setters we dont need these
        
        //this.make = make;
        //this.model=model;
        //this.year=year;
        
        //we replace with the following
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getYear(){
        return year;
    }
    
    //we need to use setters so we can change the values of attributes outside the class because we have them private
    public void setMake(String make){
        this.make = make;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
}
