
import java.util.Scanner;

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
        
        //exception = an event after execution, that disrupts the normal
        //ex.ArithmaticException,ArrayIndexOutOfBoundsException,FileNotFound Exception
        
        //user defined exceptions = custom exceptions
        //ex.DuplicateEmail,InvalidCreditException,AgeException
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        
        try{
        checkAge(age);
        }
        catch(Exception e){
            System.out.println("A problem occured: "+e);
        }
  
    }
    
    static void checkAge(int age)throws AgeException{
        
        if(age<18){
            throw new AgeException("\n"+"must be 18 or older to get in kiddddd");
        }else{
            System.out.println("you are now signed up");
        }
            
        
    }
    
    
}
