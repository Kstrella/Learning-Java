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
public class Main {
    
    public static void main(String[] args)
    {
        
        Car car1 = new Car("Chevy","camaro",2021);
        //Car car2 = new Car("Ford","Mustang",2022);
        
        //what if we want to copy the values of car 1 into car 2?
        //car2.copy(car1);
        Car car2 = new Car(car1);
        
        System.out.println(car1);//adress
        System.out.println(car2);//adress
        System.out.println();
        
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        
        System.out.println();
        
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
      
    
}
