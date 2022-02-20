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
public class LogicalOperators {
    public static void main(String[] args)
    {
        //logical operators = things used to connect 2 expressions
        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // !  = (NOT) reverses boolen condition
        
        Scanner scanner = new Scanner(System.in);
        
        
        /* FOR AND
        int temp = scanner.nextInt();
        
        if(temp > 30){
            System.out.println("its hout outside");
        }
        else if(temp >=20 && temp <=30){
            System.out.println("its warm outside");
        }
        else{
            System.out.println("its cold outside");
        }
        */
        
        /* FOR OR
        System.out.println("YOu are playing a game! Press Q or q to quit!");
        String response = scanner.next();
        
        if(response.equals("q") || response.equals("Q")){
            System.out.println("Game Quit");
        }
        else{
            System.out.println("You are still in game");
        }
*/
        
        System.out.println("YOu are playing a game! Press Q or q to quit!");
        String response = scanner.next();
        
        if(!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still in game");
        }
        else{
            System.out.println("Game Quit");
        }


    }
}
