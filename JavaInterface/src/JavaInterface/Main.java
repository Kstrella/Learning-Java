/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterface;

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    public static void main(String[] args)
    {
        //interface = a template that can be applied to a class
        //similar to inheritance, but specifies what a class has/must do.
        //classes can apply more than one interface, inheritance is limited to 1 super class
        
        //we gonna make 2 interfaces, 1 prey and one predator
        
        //pray interface
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        //predator interface
        Hawk hawk = new Hawk();
        hawk.hunt();
        
        //both
        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
    
}
