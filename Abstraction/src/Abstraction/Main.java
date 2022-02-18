/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    public static void main(String[] args){
        
        //abstract = abstract classes cant be instantiated , but they can have a subclass
        //abstract methods are declared without implimentation
        //adds a layer of security
        
        Car car = new Car();
       // Vehicle vehicle = new Vehicle(); //we need to use a child class of vehicle because it is abstract
       
       car.go();
    }
    
}
