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
public class ForLoop {
    public static void main(String[] args){
        //for loops execute a block of code for specified iterations
        //   counter, #iterations, incrament counter
        /*Print 1-10
        for (int i = 0; i <= 10; i++) {
           System.out.println(i);
        }
*/
        //counts down
        /*
        for (int i = 10; i <= 0; i-=2) {
           System.out.println(i);
        }
        System.out.println("Happy new year");
    }*/
        
        
        
        
        // MAKING AN X PATTERN ON A 2d ARRAY
        int row = 5;
        int col = 5;
        for (int i = 0; i < row; i++) {
            System.out.println();
           
            
            for (int j = 0; j < col; j++) {
                
                
                if(i == j || i+j == col-1 )
                 {
                     
                     System.out.print(" B ");
                     
                 }
               
                
                else{
                     System.out.print(" X " );
                 }
                
               
                 
                
            }
        }
         
    
}
}
