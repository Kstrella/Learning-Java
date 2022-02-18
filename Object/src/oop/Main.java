/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author kevinestrella
 */
public class Main {
     public static void main(String[] args)
    {
        //object is an instance of a class that may contain attributes(characteristic object has) and methods(what the object can do)
        //example :(phone,desk,computer,coffee cup)
        //ex. coffee cup attributes: color white, temp 20.0, bool empty = true
        //what can it do (methods) drink() print you drink the coffee, spill() print spill the cofee
       
        // calling car object
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        
        myCar1.drive();
        myCar1.brake();
     
    }
    
}
