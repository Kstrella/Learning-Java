/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    //inheritance = process where one class aquires the attributes and methods of anothet
    //car and bicicle class to inherit whats in vehicle class
    public static void main(String[] args)
    {
        Car car = new Car();
        //we dont have go inside car but because its a decendent of vehicle we can use it
        car.go();
        Bike bike = new Bike();
        
        bike.stop();
        
        System.out.println(car.speed);
        System.out.println(bike.speed);
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
    
}
