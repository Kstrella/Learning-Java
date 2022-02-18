/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrind;

import java.util.ArrayList;

/**
 *
 * @author kevinestrella
 */

//array list is a resizable array. Elements can be added or removed after compilation phase
public class ArrayLists {
    public static void main(String [] args)
    {
        //have to use wrapper class inside < >.
        //instead of int it would be Integer
        ArrayList<String> food = new ArrayList<String>();
        
       food.add("pizza");
       food.add("burger");
       food.add("hotdog");
       
       food.set(0, "Sushi");
       
       food.remove(2);
       
       food.clear();
       
        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
            
        }
    }
    
}
