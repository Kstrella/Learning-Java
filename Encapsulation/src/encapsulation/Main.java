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
public class Main {
    
    //Encapsulation = attributes of a class will be hidden or private,
    //Can be accessed only through methods(getters & setters)
    //you should make attributes private if you dont have reason to make them public
    //we should use this in our programs
    
    //to get stuff drom Car class we need getters and setters
 public static void main(String[] args){
     
     
     Car car = new Car("Chevy","Camaro",2021);
     
    // System.out.println(car.make);
    System.out.println(car.getMake());
    System.out.println(car.getModel());
    System.out.println(car.getYear());
    
    //we use setters to change the attributes
    //car.year == 2022;
   car.setMake("Tesla");
   car.setModel("ModelX");
   car.setYear(2022);
   
   System.out.println(car.getMake());
    System.out.println(car.getModel());
    System.out.println(car.getYear());
   
   
 }  
    
}
