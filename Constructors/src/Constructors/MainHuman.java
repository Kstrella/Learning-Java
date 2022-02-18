/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructors;

import Constructors.Human;

/**
 *
 * @author kevinestrella
 */
public class MainHuman {
    public static void main(String[] args)
    {
       //constructor = special method that is called when an object is instantiated(created)
        
           // passing arguments into constructer lets us add new attributes to object
        //allows us to cuntroct objects with changing attributes
        Human human1 = new Human("rick",65,70.8);
        Human human2 = new Human("morty",15,50.8);
        System.out.println(human1.name);
        System.out.println(human2.name);
        
        human2.eat();
        human1.drink();
        
     
    }
}
