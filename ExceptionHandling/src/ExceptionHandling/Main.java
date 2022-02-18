/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kevinestrella
 */
public class Main {
    
    public static void main(String[] args)
    {
        //exception = an event that occurs during the execution of a program that,
        //disrupts the normal flow of instructions
        
      
        //TRY AND CATCH
        
         Scanner scanner = new Scanner(System.in);
        try {
            
        
        System.out.println("Enter a whole number to divide");
        
        int x = scanner.nextInt();
        
        
        System.out.println("Enter a whole number to divide");
        
        int y = scanner.nextInt();
        
        int z = x/y;
        System.out.println("Result: "+z);
        }
        catch(ArithmeticException e){
            
            System.out.println("you cant divide by 0 mamaou");
            
        }
        
        catch(InputMismatchException e){
            
            System.out.println("THATS NOT A NUMBER HOE");
            
        }
        //this catches all exceptions
        catch(Exception e){
            
            System.out.println("somthing went wrong");
            
        }
        
        
        finally{
            scanner.close();
            System.out.println("This will always print");
        }
        
        
    }
    
}
