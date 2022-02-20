/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author kevinestrella
 */
public class Arrays {
    public static void main(String[] args)
    {
        //array stores multiple values in a variable
        
        String[] cars = {"Camaro","Vett","Tesla","BMW"};
        
        cars[0] = "MustyBoi";
        
        System.out.println(cars[0]);
        
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);    
        }
        
        
        // other way to make array
        String[] animal = new String[3];
        
        animal[0]= "dog";
        animal[1]= "cat";
        animal[2]= "bird";
        
        for(int i = 0; i < animal.length; i++) {
            System.out.println(animal[i]);    
        }
        
        


        
        
        
        
    }
    
}
