/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author kevinestrella
 */
import javax.swing.JOptionPane;
public class GUIntro {
    public static void main(String[] args){
        
        String name = JOptionPane.showInputDialog("Enter your name");
        
        JOptionPane.showMessageDialog(null,"Hello "+ name);
        
        //we need parse int because JPane returns string so parse int goes in and finds the # and converts it back to int
        int age =Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); 
        JOptionPane.showMessageDialog(null,"You are "+ age+" years old");
        
        double height =Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); 
        JOptionPane.showMessageDialog(null,"You are "+ height+" cm tall");
                
    
        
}
    
}
