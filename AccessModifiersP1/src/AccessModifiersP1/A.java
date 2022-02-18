/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessModifiersP1;

/**
 *
 * @author kevinestrella
 */
public class A {
    
    protected String protectedMessage = "This is protected";
    
    /*
   public static void main(String[] args){
        
        C c = new C();
        
       // System.out.println(c.defaultMessage);
       System.out.println(c.publicMessage);//seen by any class in the whole project folder because public
        
    }
*/
    
    public static void main(String[] args){
        
        B b = new B ();
        
      
       System.out.println(b.privateMessage);// not visible because its only seen in its own class
       
    }
    
}
