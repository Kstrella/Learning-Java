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
public class ForEachLoop {
    public static void main(String[] args){
        //for each(enhanced for loop)= traversing technique to iterate yjtough elements in an array
        //less steps ,more readable. less flixible though
        
       // String [] animals = {"cat","dog","rat","bird"};
       ArrayList<String> animals = new ArrayList<String>();
       animals.add("cat");
       animals.add("dog");
       animals.add("rat");
       animals.add("bird");
        //for every string index in (:) out array of animals
        for(String i : animals){
            System.out.println(i);
            
        }
        
        
        
    }
    
}
