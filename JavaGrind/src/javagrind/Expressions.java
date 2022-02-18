/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrind;

/**
 *
 * @author kevinestrella
 */
public class Expressions {
    
    public static void main(String[] args) {
        //expression = combo of operands and operators
        //operands = values,variables,numbers
        //operators = + - * / %
        //% gives remainders 
        
        int friends = 10;
        int friends2 = 10;
        
        friends = friends +1;
        // or you can just friends++ or friends --
        
        
        
        //when dividing 2 diff data types we can cast
        friends2 = (int)((double) friends2 / 3);
        
        
        System.out.println(friends);
        System.out.println(friends2);
        
    }
    
}
