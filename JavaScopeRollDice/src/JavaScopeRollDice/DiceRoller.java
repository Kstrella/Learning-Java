/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaScopeRollDice;

import java.util.Random;

/**
 *
 * @author kevinestrella
 */
public class DiceRoller {
    //VARIABLE SCOPE
    
        Random random;//global now
        int number;//global now
    
    DiceRoller(){
       // Random random = new Random();//local so its only seen here
       // int number = 0;//local so its only seen here
        random = new Random();
         //roll(random,number)
        roll();
   
    }
    
    //roll(Random random, int number)
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
    
    
    
    
    
}
