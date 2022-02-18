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
public class Main {
  
    //method overiding = Declaring a method in a sub class,
    //which is alreday in the parent class.
    //done so the child class can give its own implimentation(version for specifics
    
    public static void main(String[] args)
    {
    Dog dog = new Dog();
    
    dog.speak();
    
    Animal animal = new Animal();
    
    animal.speak();
    
    
    }
}
