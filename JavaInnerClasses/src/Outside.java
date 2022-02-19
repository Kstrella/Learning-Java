/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevst
 */
public class Outside {
    String x = "Hello ";
    
    public class Inside{
        String y = "World!";
        
        public void greeting()
        {
            System.out.println(x + y);
        }
    }
}
