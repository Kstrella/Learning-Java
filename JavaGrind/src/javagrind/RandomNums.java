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
import java.util.Random;
public class RandomNums {
    public static void main(String[] args)
    {
        Random random = new Random();//not truley random but psedo random
        
        //ex. 6 for a 6 sided dice but only from 0-5 we +1 for 0-6
        int x = random.nextInt(6)+1;//to limit size of random number we pass a number
        
        Double y = random.nextDouble(); //rand val between 0 and 1 but not used too often
        
        boolean z = random.nextBoolean(); //true or false random
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        
    }
    
}
