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
public class TwoDArray {
    public static void main(String[] args)
    {
        /*
        //2D array = array of arrays has rows and columns
        String[][] cars = new String[3][3];
        
        //row 0 colomn 0
        cars[0][0]= "camaro";
        cars[0][1]= "vett";
        cars[0][2]= "truck";
        
        cars[1][0]= "mustyboi";
        cars[1][1]= "ranger";
        cars[1][2]= "F150";
        
        cars[2][0]= "rari";
        cars[2][1]= "lambo";
        cars[2][2]= "tesla";
        */
        //or we can better assign like this
         String[][] cars = {
             {"camaro","vett","truck"},
             {"mustyboi","ranger","F150"},
             {"rari","lambo","tesla"}
         };
         
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]);
                
            }
            
        }
    }
    
}
