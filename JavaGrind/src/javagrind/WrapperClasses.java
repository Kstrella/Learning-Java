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
public class WrapperClasses {
   public static void main(String [] args)
    {
        //Wrapper classgives us a way to use primitive data tyoes as reference data types
        //refernce data types contain useful methods and can be used with collections(array lists)
        
        //Primatvie         //Wrapper(Capital and spelled out)
       /*
        boolean             Boolean
        char                Character
        int                 Integer
        double              Double
       */
        
        //autoboxing = automatic conversion Java compiler does between primitive data types and corresponding object wrapper class
        //unboxing = reverse of auto boxing. Automatic conversion of wrapper to primative
        
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";
        
        //a.
        //b.
        //c.
        //d.
        //e.
        
        
        if(a == true) System.out.println("this is true");
        
    }
    
}
