
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinestrella
 */
public class Main {//POP UPS
    
    public static void main(String[] args)
    {
       // JOptionPane = pop up or standard dialog box that prompts users for a value
        //or informs them of somthing
        
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        //this makes the pop up message                                        plain message type there are 5
       // JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
       //JOptionPane.showMessageDialog(null, "Here is more useless info", "title2", JOptionPane.INFORMATION_MESSAGE);
       //JOptionPane.showMessageDialog(null, "Really?", "title3", JOptionPane.QUESTION_MESSAGE);
       // while(true){ makes a virus
       //JOptionPane.showMessageDialog(null, "Your computer has a VIRUS", "title4", JOptionPane.WARNING_MESSAGE);
       // }
        
      //JOptionPane.showMessageDialog(null, "CALL TECH SUPPORT NOW!", "title5", JOptionPane.ERROR_MESSAGE);
        /*
       while(n!=0)
       {
           
        switch(n){
            case 1:
                //this makes the pop up message                                        plain message type there are 5
            JOptionPane.showMessageDialog(null, "This is some useless info", "title1", JOptionPane.PLAIN_MESSAGE);
            n--;
            break;
                
            case 2:
               JOptionPane.showMessageDialog(null, "This is some useless info", "title2", JOptionPane.INFORMATION_MESSAGE);
               n--;
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "This is some useless info", "title3", JOptionPane.QUESTION_MESSAGE);
                n--;
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "This is some useless info", "title4", JOptionPane.WARNING_MESSAGE);
                n--;
                break;
            
            case 5:
                JOptionPane.showMessageDialog(null, "This is some useless info", "title5", JOptionPane.ERROR_MESSAGE);
                n--;
                break;
                
            default:System.out.println("not an option");
        }
       }
        */
        
        //Show confirm dialog box
        
        
        // JOptionPane.showConfirmDialog(null, "you even code bro????", "title5", JOptionPane.YES_NO_CANCEL_OPTION);
       // System.out.println(JOptionPane.showConfirmDialog(null, "you even code bro????", "title5", JOptionPane.YES_NO_CANCEL_OPTION));
        //you can put this in an int and use it as a conditional because yes = 0 no = 1 cancel = 2 x = -1
        //can be put in an if
        //int ans = JOptionPane.showConfirmDialog(null, "you even code bro????", "title5", JOptionPane.YES_NO_CANCEL_OPTION);
        
        //user input dialog
        
      // String name = JOptionPane.showInputDialog("What is your name?");
       // System.out.println("Hello " +name);
        
        //combines all into 1
        String[] rsp = {"no u awesone","thnx","blushhhhh"};
        ImageIcon icon = new ImageIcon("a.jpg");
        JOptionPane.showOptionDialog(null, "you are awesome", "secret message",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, rsp, 0);
    }
    
}
