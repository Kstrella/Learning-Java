/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructors;

/**
 *
 * @author kevinestrella
 */

//CONSTRUCTORS
public class Human {
    
    //creating constuctor 
    //same name as class
    String name;
    int age;
    double weight;
    Human(String name,int age,double weight){
        //we use this. so that we can change the name and info of each variable
        this.name = name;
        this.age = age;
        this.weight = weight;
           
    }
    
    //we use this so it can use the name we are referencing
    void eat(){
        System.out.println(this.name + " is eating");
    }
    
    void drink(){
        System.out.println(this.name + " is drinking");
    }
    
   
           
    
}
