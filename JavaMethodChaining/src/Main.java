/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevst
 */
public class Main {
    
  public static void main(String[] args) {
      
      //method chaining = a common syntax for invoking multiple method calls in OOP
      //condence code into less lines 
      
      String name = "           bro";
      
      // we will use method chaning to do the following 3 lines in one line
      //name = name.concat(" code       ");
      //name = name.toUpperCase();
      //name = name.trim();
      
      name = name.concat(" code       ").toUpperCase().trim();
      
      System.out.println(name);
      
  }
    
}
