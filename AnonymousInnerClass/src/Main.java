/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    public static void main(String[] args){
        
        /*
        Anonymous class = an inner class without a name
        only a single object created from one
        the object may have "extras" or "changes"
        and no need to create a seperate innerclass
        when it only needs it once
        Helps us to avoid cluttering code with a class name
        
        Syntax is similar to a constructor,
        except that there is also a class definition within a block of code
        GREAT FOR LISTINERS 
        
        */
        
        /*
        //ex 1 basic welcome message
         //Greeting greeting = new Greeting();
         //we make anaon inner class  instead
         
         //this lets us change the fumnction from in here(extra or change)
         Greeting greeting = new Greeting(){
            public void Welcome()
            {
                System.out.println("OVERRIDE!");
            }  
         };
         
       
         greeting.Welcome();
         
         Greeting greeting2 = new Greeting();
         greeting2.Welcome();
         */
        
        //ex 2 using anaon inner class for an action listiner
        
        MyFrame myFrame = new MyFrame();
        
    }
}
