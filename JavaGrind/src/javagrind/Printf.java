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
public class Printf {
    
    public static void main(String[] args){
        
        //printf() = optional method to control, forat and display text on to console window
        //2 arguments = format string + (object/variable/value)
        //% flags, precision, width, conversion character
        
        boolean myBool=true;
        char mychar = '@';
        String myStr="Bro";
        int myInt= 50;
        double myDub=1000;
        
        System.out.printf("%b \n", myBool);
        System.out.printf("%c \n", mychar);
        System.out.printf("%s \n", myStr);
        System.out.printf("%d \n", myInt);
       // System.out.printf("%f", myInt);
       
       //width
       //min number of characters to be written as output
        System.out.printf("Hello %10s \n",myStr);
        
        //precision
       //min number of digits of precision when outputting floating point values
        System.out.printf("you have this much money %.2f \n",myDub);
        
         //flags
       //adds effect to the output based on the flag added ti the format specifier
       // - :left justify
       // + : output a (+) or (-) sign for a numeric value
       // 0 : numeric values are zero padded
       // , : grouping separator if numbers > 1000
        System.out.printf("you have this much money %-20f \n",myDub);
        System.out.printf("you have this much money %+f \n",myDub);
        System.out.printf("you have this much money %020f \n",myDub);
        System.out.printf("you have this much money %,f \n",myDub);



    }  
}
