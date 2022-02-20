/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author kevinestrella
 */
public class JavaMethods {
    /*
    public static void main(String[] args)
    {
        //method = block of code that is executed when called upon like a function in C
        String name = "bro";
        int age = 24;
        hello(name,age);
       
        
    }
    
    public static void hello(String name,int age){
        System.out.println("hello " + name);
        System.out.println("you are  " + age + " years old");
    }
*/
    
     public static void main(String[] args)
    {
        int x = 3;
        int y = 4;
        
        int z = add(x,y);
        System.out.println(z);
        
        //or
        
        System.out.println(add(x,y));
        
        
    }
    
     static int add(int a,int b)
     {
         int z = a+b;
         return z;
         //or return a+b;
         
     }

}
