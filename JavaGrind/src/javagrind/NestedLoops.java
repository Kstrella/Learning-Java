/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrind;

import java.util.Scanner;

/**
 *
 * @author kevinestrella
 */
public class NestedLoops {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int colomns;
        String symbol = "";
        
        System.out.println("Enter # of rows");
        rows = scanner.nextInt();
        
        System.out.println("Enter # of colomns");
        colomns = scanner.nextInt();
        
        System.out.println("Enter a symbol to use");
        symbol = scanner.next();
        
        //outer loop is rows and inner is colomns
        
        for (int i = 1; i < rows; i++) {
            System.out.println();
            
            for (int j = 1; j < colomns; j++) {
                System.out.print(symbol);
            }
            
        }
        
    }
}
