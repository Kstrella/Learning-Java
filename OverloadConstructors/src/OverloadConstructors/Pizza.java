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
public class Pizza {
    
    String bread;
    String sauce;
    String cheese;
    String topping;
    
    
    
    
    
    
    Pizza(String bread,String sauce,String cheese,String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    
    //if we want pizza with out somthing we need an overloaded constructor!
    //this one has no toppings
    Pizza(String bread,String sauce,String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        
    }
    
    //this one has no toppings //vegan?
    Pizza(String bread,String sauce){
        this.bread = bread;
        this.sauce = sauce;
        
    }
    
    //this one has no toppings //onlybread?
    Pizza(String bread){
        this.bread = bread;
        
    }
}
