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
//intead of using a bunch of if statements
//ex day of the week compared to list of days
public class JavaSwitchStatement {
        public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        
        switch(day)
        {
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            
            default: System.out.println("That is not a day");
        }
        
    }
    
}
