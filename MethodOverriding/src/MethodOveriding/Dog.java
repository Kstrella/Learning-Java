/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOveriding;

/**
 *
 * @author kevinestrella
 */
public class Dog extends Animal {
    
    //this is an overide because animal already has speak
    //it will use this one and not the one from the parent
    //@overide isnt necesary but it lets you know what you did
    
    @Override//doesnt add any functionality
    void speak()
    {
        System.out.println("The dog goes bark");
    }
  
    
}
