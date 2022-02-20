/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;
import java.util.Scanner;//to get user input
/**
 *
 * @author kevinestrella
 */

//if you use next liune after next int it will read the empty null terminator from the in

public class UserInpit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        
        scanner.nextLine();//clears the new line so you can enter input for the next new line 
        System.out.println("what is your favorite food?");
        String food = scanner.nextLine();
        
        System.out.println("hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);
         
         
        
    
        
        //variables in java
        
    }
    
}
