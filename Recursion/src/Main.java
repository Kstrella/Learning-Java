
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
        
        //the process in which a method calls itrself continuously
        //a method that calls itself is called a recursive method
        //useful for factorials,traversing,trees,and simplifying
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times do you wanna say hello?");
        int num = scanner.nextInt();
        
        helloWorld(num);
        
    }
    
    static void helloWorld(int n){
        
        if(n>0)
        {
        System.out.println("Hello World!"+ n);
        n--;
        helloWorld(n);
        }
    }
    
}

