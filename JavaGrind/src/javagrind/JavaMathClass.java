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

public class JavaMathClass {
    public static void main(String[] args)
    {
        /*
        double x = 3.14;
        double y = 10;
        
        double z =Math.min(x, y);
        double c =Math.max(x, y);
        double d =Math.abs(y);
        double s =Math.sqrt(y);
        double r =Math.round(x);
        double w =Math.ceil(x);//always rounds up
        double e =Math.floor(x);//always rounds down
        
        System.out.println(z);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(r);
        System.out.println(w);
        System.out.println(e);
*/

        //program to find the hypotenues of a triangle
        double x;
        double y;
        double z;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter side x");
        x = scanner.nextDouble();
        System.out.println("Enter side y");
        y = scanner.nextDouble();
        
        // hypotenuse = square root of x^2+y^2
        z = Math.sqrt((x*x)+(y*y));
        
        System.out.println("The hypotenuse is "+ z);
        scanner.close();
        
    }
    
}
