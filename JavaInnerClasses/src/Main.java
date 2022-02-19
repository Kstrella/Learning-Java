/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevst
 */
public class Main {
    
    public static void main(String[] args){
        /*
          inner class = A class inside of another class.
        useful if a class should be limited in scope
        usually private but not necessary
        helps group classes that belong together
        extremely useful for listiners for specific events
        precursor for anonymous inner classes
        */
        
        //this is for the instance of outside 
        Outside out = new Outside();
        //this is for the instance of the inner class inside usingf the outside
        Outside.Inside in = out.new Inside();
        //how to print what is in outer X and whats in inner y
       // System.out.println(out.x+in.y);
       
       //printing using method inside inner class
       in.greeting();
        
    }
    
}
