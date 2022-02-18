/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKeyWord;

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    //super = key word refers to a super class(parent) of an object
    //very similar to the "this" key word
    
    public static void main(String[] args){
        
        Hero hero1 = new Hero("Batman",42,"$$$$");
        Hero hero2 = new Hero("Superman",42,"everyhing");
        
        
        /*
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        */
        System.out.println(hero2.toString());
        
        System.out.println(hero1.toString());
        
        
    }
    
}
