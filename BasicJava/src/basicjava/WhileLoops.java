/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author kevinestrella
 */
public class WhileLoops {
    public static void main(String[] args)
    {
        //executes a block of code while the condition is true
        //ask for name, if dont typwe then ask again
        
       Scanner scanner = new Scanner(System.in);
       
       String name = "";
       /* NORMAL WHILE LOOP
       while(name.isEmpty()){
        
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
    }
        System.out.println("Hello "+ name);
        */
       //DO WHILE LOOP does the code once and repeats if while is true
       do{
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        }while(name.isEmpty());
        System.out.println("Hello "+ name);
        
    }
    
}
