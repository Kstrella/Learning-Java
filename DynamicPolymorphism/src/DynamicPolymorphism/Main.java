/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicPolymorphism;

import java.util.Scanner;

/**
 *
 * @author kevinestrella
 */
public class Main {
    //polymorphism = many shapes/forms
    //dynamic = after compilation (during runtime
    //ex. A corvette is a : corvette, and a car,and a vehicle, and an object
    public static void main(String[] args){
        
        //this is like picking boy or girl in pokemon
        //also like a race in skyrim
        
        Animal animal;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What animal do you want?");
        System.out.println("(1 = dog)   (2 = cat)");
        int choice = scanner.nextInt();
        
        if(choice ==1)
        {
            animal = new Dog();
            animal.speak();
        }
        
        else if(choice ==2)
        {
             animal = new Cat();
             animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("Invalid");
            animal.speak();
        }
     
        
    }
}
