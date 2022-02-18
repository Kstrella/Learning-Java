/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadConstructors;

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    //overloaded constructors = multiple cunstructors withing a class with the same name, but diff parameters
    //name+parameters = signature
    
       public static void main(String[] args)
    {
        Pizza za = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
        System.out.println("here are the ingrediants to your pizza");
        System.out.println(za.bread);
        System.out.println(za.cheese);
        System.out.println(za.sauce);
        System.out.println(za.topping);
        
        
        Pizza za2 = new Pizza("thicc crust","tomato","mozzerella","pepperoni");
        System.out.println("here are the ingrediants to your pizza2");
        System.out.println(za2.bread);
        System.out.println(za2.sauce);
        
        
        //what if we want pizza no topping? overloaded constructors!
                
    }
    
}
