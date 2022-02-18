/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toString;

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    public static void main(String[] args){
        //toString() = special method that all objectsinherrit,
        //that retruns a string that "textually represents" an object.
        //can be used both implicitly nd explicitly
        
        Car car = new Car();
        
        /*
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);
        */
        System.out.println(car);//prints adress of car in mem
        //we gotta overide to toString to get the text version
        System.out.println(car.toString()); 
        System.out.println(car); //this works now too
        
    }
}
