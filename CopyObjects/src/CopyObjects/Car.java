/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopyObjects;

/**
 *
 * @author kevinestrella
 */
public class Car {
    
    private String make;
    private String model;
    private int year;
    
    Car(String make,String model,int year){
        
      
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    
    //this does the same as the copy class but we just put whats in car 1 into car 2
    Car(Car x){
        this.copy(x);
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
    //we copy from car 1 into car 2
    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
